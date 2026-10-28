package studio.vaif

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import okhttp3.*
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.Closeable
import java.io.IOException
import kotlinx.coroutines.CancellationException
import okio.ForwardingSource
import okio.buffer

/**
 * One outgoing request. Custom transports must protect its headers and body.
 * @property method HTTP method in uppercase.
 * @property url Validated absolute target URL.
 * @property headers HTTP headers, potentially containing credentials.
 * @property body Encoded request bytes, or null for no body.
 */
public data class HttpRequest(public val method: String, public val url: HttpUrl, public val headers: Map<String, String> = emptyMap(), public val body: ByteArray? = null) {
    /**
     * Returns a diagnostic string with the URL, credentials and request content redacted.
     */
    public override fun toString(): String = "HttpRequest($method, [url and credentials redacted])"
}
/**
 * Buffered transport result; response content may contain sensitive data.
 * @property status HTTP status code.
 * @property headers Response headers; lookup must be case-insensitive.
 * @property body Complete response bytes.
 */
public data class HttpResponse(public val status: Int, public val headers: Map<String, String>, public val body: ByteArray) {
    /**
     * Returns a diagnostic string with credentials and response content redacted.
     */
    public override fun toString(): String = "HttpResponse(status=$status, body=[redacted])"
}

/**
 * HTTP transport contract. Implementations must disable redirects and automatic request replay.
 */
public interface Transport {
    /**
     * Executes one HTTP request and buffers its response; cancellation releases the active call.
     * @param request HTTP method, URL, headers and optional body.
     * @return Status, headers and buffered response bytes.
     * @throws IOException On a network failure; the client converts it to NETWORK_ERROR. Cancellation propagates unchanged.
     * @throws VaifException On an SDK failure.
     */
    public suspend fun execute(request: HttpRequest): HttpResponse
    /**
     * Opens an unbuffered HTTP stream. The caller must close the returned response.
     * @param request HTTP method, URL, headers and optional body.
     * @return The open response, owned by the caller.
     * @throws IOException On a network failure; the client converts it to NETWORK_ERROR. Cancellation propagates unchanged.
     * @throws VaifException On an SDK failure or when streaming is unsupported.
     */
    public suspend fun stream(request: HttpRequest): Response = throw VaifException("Streaming is unavailable on this transport", "NOT_SUPPORTED")
}

/**
 * Cancellable OkHttp transport with redirects and automatic connection retries disabled.
 * @param client Base client; the derived client shares its dispatcher, pool and cache. Close this transport only when those resources can be shut down.
 */
public class OkHttpTransport(client: OkHttpClient = OkHttpClient()) : Transport, Closeable {
    internal val client = client.newBuilder().followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(false).build()
    private fun build(request: HttpRequest): Request {
        val builder = Request.Builder().url(request.url)
        request.headers.forEach { (key, value) -> builder.header(key, value) }
        val contentType = request.headers.entries.firstOrNull { it.key.equals("Content-Type", true) }?.value?.toMediaType()
        val body = request.body?.toRequestBody(contentType)
            ?: if (request.method in setOf("POST", "PUT", "PATCH")) ByteArray(0).toRequestBody(contentType) else null
        return builder.method(request.method, body).build()
    }
    /**
     * Opens an unbuffered HTTP stream. The caller must close the returned response.
     * @param request HTTP method, URL, headers and optional body.
     * @return The open response, owned by the caller; read failures are reported as NETWORK_ERROR.
     * @throws VaifException With code NETWORK_ERROR when the connection fails. Cancellation propagates unchanged.
     */
    public override suspend fun stream(request: HttpRequest): Response = suspendCancellableCoroutine { continuation ->
        val call = client.newCall(build(request))
        continuation.invokeOnCancellation { call.cancel() }
        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                if (!continuation.isCancelled) continuation.resumeWith(Result.failure(networkError()))
            }
            override fun onResponse(call: Call, response: Response) {
                continuation.resume(safeStreamResponse(response)) { _, value, _ -> value.close() }
            }
        })
    }
    /**
     * Executes one HTTP request and buffers its response; cancellation releases the active call.
     * @param request HTTP method, URL, headers and optional body.
     * @return Status, headers and buffered response bytes.
     * @throws VaifException With code NETWORK_ERROR when the connection or body read fails. Cancellation propagates unchanged.
     */
    public override suspend fun execute(request: HttpRequest): HttpResponse = suspendCancellableCoroutine { continuation ->
        val call = client.newCall(build(request))
        continuation.invokeOnCancellation { call.cancel() }
        // Keep the continuation active while reading the body so cancellation cancels the socket read.
        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                if (!continuation.isCancelled) continuation.resumeWith(Result.failure(networkError()))
            }
            override fun onResponse(call: Call, response: Response) {
                val result = runCatching {
                    response.use { HttpResponse(it.code, it.headers.toMultimap().mapValues { h -> h.value.joinToString(",") }, it.body?.bytes() ?: ByteArray(0)) }
                }
                if (!continuation.isCancelled) continuation.resumeWith(result.recoverCatching { throw networkError() })
            }
        })
    }
    /**
     * Shuts down the shared dispatcher executor, evicts idle connections and closes the cache.
     * Cancel outstanding caller jobs before closing this transport.
     * @throws IOException If closing the configured cache fails.
     */
    public override fun close(): Unit { client.dispatcher.executorService.shutdown(); client.connectionPool.evictAll(); client.cache?.close() }
}

internal fun safeUrl(url: String): HttpUrl {
    if (!Regex("^https?://", RegexOption.IGNORE_CASE).containsMatchIn(url)) validation("Expected an HTTP or HTTPS URL")
    val parsed = try { url.toHttpUrl() } catch (e: IllegalArgumentException) { validation("Invalid URL") }
    if (parsed.username.isNotEmpty() || parsed.password.isNotEmpty()) validation("URL credentials are not supported")
    if (!parsed.isHttps && parsed.host !in setOf("localhost", "127.0.0.1", "::1")) validation("HTTP is allowed only on localhost, 127.0.0.1 and ::1")
    return parsed
}

internal fun networkError() = VaifException("The network request failed", "NETWORK_ERROR")

internal suspend fun <T> sdkNetwork(block: suspend () -> T): T = try { block() }
catch (e: CancellationException) { throw e }
catch (e: VaifException) { throw e }
catch (e: IOException) { throw networkError() }

internal fun safeStreamResponse(response: Response): Response {
    val original = response.body ?: return response
    val source = object : ForwardingSource(original.source()) {
        override fun read(sink: okio.Buffer, byteCount: Long): Long = try { super.read(sink, byteCount) }
        catch (e: IOException) { throw networkError() }
        override fun close(): Unit { try { super.close() } catch (e: IOException) { throw networkError() } }
    }.buffer()
    return response.newBuilder().body(object : ResponseBody() {
        override fun contentType() = original.contentType()
        override fun contentLength() = original.contentLength()
        override fun source() = source
    }).build()
}

internal fun segment(value: String): String {
    if (value.isBlank() || value == "." || value == "..") validation("A nonempty path segment is required")
    return HttpUrl.Builder().scheme("https").host("encode.invalid").addPathSegment(value).build().encodedPath.substring(1)
}

internal fun decodeJson(response: HttpResponse): JsonElement {
    if (response.body.isEmpty()) return JsonNull
    return try { vaifJson.parseToJsonElement(response.body.decodeToString()) }
    catch (e: IllegalArgumentException) { throw VaifException("API returned invalid JSON", "INVALID_RESPONSE", response.status) }
}

internal fun checkResponse(response: HttpResponse): HttpResponse {
    if (response.status !in 200..299) {
        val body = runCatching { decodeJson(response) as? JsonObject }.getOrNull()
        val nested = body?.get("error") as? JsonObject
        throw VaifException(
            body?.string("message") ?: nested?.string("message") ?: body?.string("error") ?: "VAIF request failed (${response.status})",
            body?.string("code") ?: nested?.string("code") ?: "HTTP_${response.status}",
            response.status,
            body?.string("requestId") ?: response.headers.entries.firstOrNull { it.key.equals("x-request-id", true) }?.value,
            body?.get("details") ?: nested?.get("details"),
        )
    }
    return response
}
