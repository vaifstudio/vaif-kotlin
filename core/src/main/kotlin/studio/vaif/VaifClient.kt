package studio.vaif

import studio.vaif.generated.Operations
import kotlinx.coroutines.*
import kotlinx.serialization.json.*
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import java.io.Closeable
import java.security.MessageDigest

/**
 * Client options. HTTPS is required except for loopback development servers.
 * @property projectId Project ID for app-user APIs; null selects console authentication.
 * @property apiKey Publishable project API key; keep service keys on a trusted server.
 * @property baseUrl API origin and optional path prefix. Defaults to the hosted API, which is not available yet.
 * @property tokenStorage Durable credential store; the default retains tokens only in memory.
 * @property defaultBucket Default storage bucket name or ID.
 */
public class VaifConfig(
    public val projectId: String? = null,
    public val apiKey: String? = null,
    public val baseUrl: String = "https://api.vaif.studio",
    public val tokenStorage: TokenStorage = MemoryTokenStorage(),
    public val defaultBucket: String = "default",
)

/**
 * Coroutine client for VAIF authentication, data, storage, functions and realtime.
 * @property config Immutable options used to initialize this client.
 * @param transport Optional custom transport owned by the caller. The default transport is owned and closed by the client.
 * @throws VaifException If the API URL or project ID is invalid.
 */
public class VaifClient(public val config: VaifConfig, transport: Transport? = null) : Closeable {
    internal val base = safeUrl(config.baseUrl).also {
        if (it.query != null || it.fragment != null) validation("baseUrl cannot contain a query or fragment")
        config.projectId?.let(::segment)
    }
    internal val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val ownedTransport = if (transport == null) OkHttpTransport() else null
    internal val transport: Transport = transport ?: ownedTransport!!
    internal val storageKey = "vaif:" + MessageDigest.getInstance("SHA-256")
        .digest((base.toString().trimEnd('/') + "|" + (config.projectId ?: "console")).toByteArray()).joinToString("") { "%02x".format(it) }
    /**
     * Authentication and session management for this client.
     */
    public val auth: Auth = Auth(this)
    /**
     * File signing and storage operations for this client.
     */
    public val storage: Storage = Storage(this)
    /**
     * Function invocation operations for this client.
     */
    public val functions: Functions = Functions(this)
    /**
     * Spec-generated operations. Platform staff and retired routes have no generated methods.
     */
    public val operations: Operations = Operations(this)
    private val realtimeConnections = java.util.concurrent.CopyOnWriteArrayList<RealtimeSubscription>()

    /**
     * Creates an immutable query scoped to the configured project.
     * @param table Table name in the configured project.
     * @return A query for the table.
     * @throws VaifException If configuration, arguments or the current session cannot support this operation.
     */
    public fun from(table: String): Query = Query(this, table)

    /**
     * Creates a cold realtime subscription using the configured OkHttp transport.
     * @param table Table name in the configured project.
     * @param filters Realtime predicates combined using the channel grammar.
     * @param columns Plain database columns to include in realtime changes.
     * @return A subscription whose sockets close on cancellation or client close.
     * @throws VaifException If configuration, arguments or the current session cannot support this operation.
     */
    public fun realtime(table: String, filters: List<RealtimeFilter> = emptyList(), columns: List<String> = emptyList()): RealtimeSubscription {
        val socketClient = (this.transport as? OkHttpTransport)?.client
            ?: throw VaifException("Use realtimeWithClient to inject a WebSocket client with a fake HTTP transport", "NOT_SUPPORTED")
        return realtimeWithClient(table, socketClient, filters, columns)
    }

    /**
     * Creates a cold subscription with an explicitly supplied WebSocket client.
     * @param table Table name in the configured project.
     * @param socketClient OkHttp client used for WebSocket connections; redirects and retries are disabled on a derived client.
     * @param filters Realtime predicates combined using the channel grammar.
     * @param columns Plain database columns to include in realtime changes.
     * @return A subscription whose sockets close on cancellation or client close.
     * @throws VaifException If configuration, arguments or the current session cannot support this operation.
     */
    public fun realtimeWithClient(table: String, socketClient: OkHttpClient, filters: List<RealtimeFilter> = emptyList(), columns: List<String> = emptyList()): RealtimeSubscription =
        RealtimeSubscription(this, socketClient, table, filters, columns).also { realtimeConnections.add(it) }

    internal fun disconnectRealtime() { realtimeConnections.forEach { it.close() } }

    internal fun forgetRealtime(subscription: RealtimeSubscription) { realtimeConnections.remove(subscription) }

    internal fun realtimeUrl(): String = url("/realtime/ws").toString().let {
        (if (base.isHttps) "wss://" else "ws://") + it.substringAfter("://")
    }

    internal fun url(path: String, query: List<Pair<String, String>> = emptyList()): HttpUrl {
        if (!path.startsWith("/") || path.startsWith("//") || path.contains('?') || path.contains('#')) validation("Expected an API-relative path")
        val builder = base.newBuilder().encodedPath(base.encodedPath.trimEnd('/') + path)
        query.forEach { (key, value) -> builder.addQueryParameter(key, value) }
        return builder.build()
    }

    internal fun consoleGuard(method: String, path: String) {
        if (method == "POST" && path in setOf("/auth/signup", "/auth/forgot-password", "/auth/reset-password")) {
            throw VaifConsoleOnlyError(if (path == "/auth/signup") "https://console.vaif.studio/register" else "https://console.vaif.studio/forgot-password")
        }
    }

    internal suspend fun request(method: String, path: String, query: List<Pair<String, String>> = emptyList(), body: ByteArray? = null,
                                 headers: Map<String, String> = emptyMap(), authenticated: Boolean = true): HttpRequest {
        consoleGuard(method, path)
        val all = mutableMapOf<String, String>()
        config.apiKey?.let { all["x-vaif-key"] = it }
        if (authenticated && headers.keys.none { it.equals("Authorization", true) }) auth.session()?.accessToken?.let { all["Authorization"] = "Bearer $it" }
        all.putAll(headers)
        return HttpRequest(method, url(path, query), all, body)
    }

    internal suspend fun send(method: String, path: String, query: List<Pair<String, String>> = emptyList(), body: JsonElement? = null,
                              headers: Map<String, String> = emptyMap(), authenticated: Boolean = true): JsonElement =
        decodeJson(checkResponse(execute(request(method, path, query, body?.toString()?.toByteArray(),
            (if (body != null) mapOf("Content-Type" to "application/json") else emptyMap()) + headers, authenticated))))

    internal suspend fun execute(request: HttpRequest): HttpResponse = sdkNetwork { transport.execute(request) }

    /**
     * Closes subscriptions, cancels client-owned refresh work and closes the default transport.
     * Custom transports remain caller-owned. Cancel outstanding caller jobs before closing.
     * @throws java.io.IOException If closing the default transport cache fails.
     */
    public override fun close(): Unit {
        disconnectRealtime()
        scope.cancel()
        ownedTransport?.close()
    }
}
