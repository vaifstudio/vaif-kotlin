package studio.vaif

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import kotlinx.serialization.json.*
import okhttp3.*
import okio.ByteString
import java.io.Closeable
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean

/**
 * One realtime channel predicate. Values for the in operator are comma-separated.
 * @property field Plain database column name.
 * @property operator Supported comparison operator; defaults to eq.
 * @property value Comparison text encoded into the channel query.
 */
public data class RealtimeFilter(public val field: String, public val operator: String = "eq", public val value: String)

/**
 * Cold realtime streams; each collection owns a socket. Failures end collection; retry is caller-controlled.
 */
public class RealtimeSubscription internal constructor(
    private val client: VaifClient,
    socketClient: OkHttpClient,
    private val table: String,
    filters: List<RealtimeFilter>,
    columns: List<String>,
) : Closeable {
    private val stopped = AtomicBoolean(false)
    private val closers = CopyOnWriteArrayList<() -> Unit>()
    private val sockets = CopyOnWriteArrayList<WebSocket>()
    private val http = socketClient.newBuilder().followRedirects(false).followSslRedirects(false)
        .retryOnConnectionFailure(false).pingInterval(25, TimeUnit.SECONDS).build()
    private val channelName: String
    init {
        val identifier = Regex("[A-Za-z_][A-Za-z0-9_]*")
        if (!identifier.matches(table)) validation("Invalid realtime table name")
        val query = client.base.newBuilder().query(null).apply {
            filters.forEach {
                if (!identifier.matches(it.field) || it.operator !in setOf("eq", "neq", "gt", "lt", "gte", "lte", "in", "like", "ilike")) validation("Invalid realtime filter")
                addQueryParameter("${it.field}.${it.operator}", it.value)
            }
            if (columns.isNotEmpty()) {
                if (columns.any { !identifier.matches(it) }) validation("Invalid realtime column")
                addQueryParameter("columns", columns.joinToString(","))
            }
        }.build().encodedQuery
        channelName = "table:$table" + (query?.let { "?$it" } ?: "")
    }

    /**
     * Protocol events including subscription, auth-refresh acknowledgments and database changes. Collection errors are VaifException; cancellation propagates.
     */
    public val events: Flow<JsonObject> = callbackFlow {
        if (stopped.get()) { close(); return@callbackFlow }
        val access = client.auth.session()?.accessToken
        val authFrame = jsonObject("type" to JsonPrimitive("auth"), "apiKey" to client.config.apiKey?.let(::JsonPrimitive),
            "accessToken" to access?.let(::JsonPrimitive))
        val welcomed = AtomicBoolean(false)
        val subscribed = AtomicBoolean(false)
        val timeout = launch { delay(15_000); if (!subscribed.get()) close(VaifException("Realtime subscription timed out", "REALTIME_TIMEOUT")) }
        val stop: () -> Unit = { close() }
        closers.add(stop)
        val socket = http.newWebSocket(Request.Builder().url(client.realtimeUrl()).build(), object : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                if (!webSocket.send(authFrame.toString())) close(VaifException("Could not send realtime auth", "REALTIME_SEND_FAILED"))
            }
            override fun onMessage(webSocket: WebSocket, text: String) {
                try {
                    val frame = vaifJson.parseToJsonElement(text).jsonObject
                    when (frame.string("type")) {
                        "welcome" -> if (welcomed.compareAndSet(false, true)) {
                            if (!webSocket.send(jsonObject("type" to JsonPrimitive("subscribe"), "channel" to JsonPrimitive(channelName)).toString()))
                                close(VaifException("Could not subscribe", "REALTIME_SEND_FAILED"))
                        }
                        "error" -> close(VaifException(frame.string("message") ?: "Realtime request failed", frame.string("code") ?: frame.string("error") ?: "REALTIME_ERROR"))
                        "subscribed" -> if (welcomed.get() && frame.string("channel") == channelName) {
                            subscribed.set(true); timeout.cancel()
                            if (trySend(frame).isFailure) close(VaifException("Realtime consumer is too slow", "REALTIME_OVERFLOW"))
                        }
                        "db_change" -> if (subscribed.get() && frame.string("table") == table) {
                            val channels = frame["channels"] as? JsonArray
                            if (channels == null || channels.any { it.jsonPrimitive.content == channelName })
                                if (trySend(frame).isFailure) close(VaifException("Realtime consumer is too slow", "REALTIME_OVERFLOW"))
                        }
                        "auth_refreshed" -> if (trySend(frame).isFailure) close(VaifException("Realtime consumer is too slow", "REALTIME_OVERFLOW"))
                    }
                } catch (e: Exception) { close(VaifException("Invalid realtime frame", "INVALID_RESPONSE")) }
            }
            override fun onMessage(webSocket: WebSocket, bytes: ByteString) = onMessage(webSocket, bytes.utf8())
            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                webSocket.close(1000, null)
                close(VaifException("Realtime connection closed ($code)", "REALTIME_CLOSED", code))
            }
            override fun onClosed(webSocket: WebSocket, code: Int, reason: String) { close(VaifException("Realtime connection closed ($code)", "REALTIME_CLOSED", code)) }
            override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                val status = response?.code
                response?.close()
                close(VaifException("Realtime connection failed", "REALTIME_CONNECTION_FAILED", status))
            }
        })
        sockets.add(socket)
        if (stopped.get()) close()
        awaitClose {
            timeout.cancel(); closers.remove(stop); sockets.remove(socket)
            socket.close(1000, "Client closed"); socket.cancel()
        }
    }.catch { error ->
        when (error) {
            is CancellationException -> throw error
            is VaifException -> throw error
            else -> throw VaifException("Realtime connection failed", "REALTIME_CONNECTION_FAILED")
        }
    }
    /**
     * Database change events after channel acknowledgment. Each collection owns its socket and propagates protocol errors.
     */
    public val changes: Flow<JsonObject> = events.filter { it.string("type") == "db_change" }

    /**
     * Sends the stored access token to active sockets. Persist or refresh the HTTP session first.
     * @throws VaifException If configuration, arguments or the current session cannot support this operation.
     */
    public suspend fun refreshAuth(): Unit {
        val access = client.auth.session()?.accessToken ?: throw VaifException("Sign in before refreshing realtime auth", "SESSION_REQUIRED")
        val frame = jsonObject("type" to JsonPrimitive("auth_refresh"), "accessToken" to JsonPrimitive(access),
            "apiKey" to client.config.apiKey?.let(::JsonPrimitive)).toString()
        sockets.forEach { if (!it.send(frame)) throw VaifException("Realtime auth refresh could not be sent", "REALTIME_SEND_FAILED") }
    }
    /**
     * Stops all collections, cancels active sockets and releases this subscription from the client.
     */
    public override fun close(): Unit {
        stopped.set(true)
        closers.forEach { it() }
        sockets.forEach { it.cancel() }
        client.forgetRealtime(this)
    }
}
