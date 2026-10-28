package studio.vaif

import kotlinx.serialization.json.*
import okhttp3.Response

/**
 * Spec metadata shared by generated methods and the operation runtime.
 * @property name Stable generated method name.
 * @property method Uppercase HTTP method.
 * @property path API-relative path template.
 * @property pathParams Required path parameter names.
 * @property queryParams Documented query parameter names.
 * @property bodyKind Request encoding: json, binary, text, or null.
 * @property bodyRequired Whether omission of the request body is invalid.
 * @property transport Response encoding: json, binary, or sse.
 * @property isPublic Whether this route occurs in the public OpenAPI spec; API authorization still applies.
 * @property deprecated Whether the spec marks this operation deprecated.
 */
public data class Operation(
    public val name: String,
    public val method: String,
    public val path: String,
    public val pathParams: List<String>,
    public val queryParams: List<String>,
    public val bodyKind: String?,
    public val bodyRequired: Boolean,
    public val transport: String,
    public val isPublic: Boolean,
    public val deprecated: Boolean,
)

/**
 * Runtime for generated JSON, binary and event-stream operations.
 */
public open class OperationsBase internal constructor(private val client: VaifClient) {
    private suspend fun build(op: Operation, path: Map<String, String>, query: JsonObject, body: ByteArray?, headers: Map<String, String>): HttpRequest {
        client.consoleGuard(op.method, op.path)
        if (op.bodyRequired && body == null) validation("${op.name} requires a body")
        if (path.keys != op.pathParams.toSet()) validation("${op.name} requires path parameters ${op.pathParams}")
        val route = Regex("\\{([^}]+)}").replace(op.path) { segment(path.getValue(it.groupValues[1])) }
        val flattened = buildList {
            fun addValue(key: String, value: JsonElement) {
                when (value) {
                    JsonNull -> Unit
                    is JsonPrimitive -> add(key to value.content)
                    is JsonArray -> value.forEach { addValue(key, it) }
                    is JsonObject -> value.forEach { (sub, v) -> addValue("$key[$sub]", v) }
                }
            }
            query.forEach { (key, value) -> addValue(key, value) }
        }
        val contentType = when (op.bodyKind) { "json" -> "application/json"; "binary" -> "application/octet-stream"; "text" -> "text/plain"; else -> null }
        return client.request(op.method, route, flattened, body,
            (if (body != null && contentType != null) mapOf("Content-Type" to contentType) else emptyMap()) + headers)
    }
    /**
     * Validates and executes a generated JSON operation.
     * @param op Generated operation metadata.
     * @param path Exact map of required path parameter names to unencoded values.
     * @param query Query parameters, with arrays repeated and objects flattened.
     * @param body Encoded request body, or null when omitted.
     * @param headers Additional HTTP headers; may override default credentials.
     * @return The decoded response, or JsonNull for an empty response.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    protected suspend fun callJson(op: Operation, path: Map<String, String>, query: JsonObject, body: ByteArray?, headers: Map<String, String>): JsonElement =
        decodeJson(checkResponse(client.execute(build(op, path, query, body, headers))))
    /**
     * Validates and executes a generated binary operation.
     * @param op Generated operation metadata.
     * @param path Exact map of required path parameter names to unencoded values.
     * @param query Query parameters, with arrays repeated and objects flattened.
     * @param body Encoded request body, or null when omitted.
     * @param headers Additional HTTP headers; may override default credentials.
     * @return The buffered response bytes.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    protected suspend fun callBinary(op: Operation, path: Map<String, String>, query: JsonObject, body: ByteArray?, headers: Map<String, String>): ByteArray =
        checkResponse(client.execute(build(op, path, query, body, headers))).body
    /**
     * Validates and opens a generated event stream. The caller must close the response.
     * @param op Generated operation metadata.
     * @param path Exact map of required path parameter names to unencoded values.
     * @param query Query parameters, with arrays repeated and objects flattened.
     * @param body Encoded request body, or null when omitted.
     * @param headers Additional HTTP headers; may override default credentials.
     * @return The open response; read failures are reported as SDK errors.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    protected suspend fun callStream(op: Operation, path: Map<String, String>, query: JsonObject, body: ByteArray?, headers: Map<String, String>): Response {
        val response = sdkNetwork { safeStreamResponse(client.transport.stream(build(op, path, query, body, headers))) }
        if (!response.isSuccessful) response.use {
            checkResponse(HttpResponse(it.code, it.headers.toMultimap().mapValues { h -> h.value.joinToString(",") }, it.body?.bytes() ?: ByteArray(0)))
        }
        return response
    }
}
