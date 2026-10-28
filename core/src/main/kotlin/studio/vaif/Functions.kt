package studio.vaif

import kotlinx.serialization.json.*

/**
 * Invokes deployed functions using the current session and project key.
 */
public class Functions internal constructor(private val client: VaifClient) {
    /**
     * Invokes a function once; HTTP 401 and other failures are never automatically replayed.
     * @param nameOrId Function name or ID, encoded as one path segment.
     * @param input JSON input passed to the function.
     * @param includeLogs Whether to request logs in the response.
     * @return The API envelope including data, logs, status and timing when supplied.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun invoke(nameOrId: String, input: JsonElement = JsonObject(emptyMap()), includeLogs: Boolean = false): JsonObject =
        client.send("POST", "/functions/${segment(nameOrId)}/invoke", if (includeLogs) listOf("includeLogs" to "true") else emptyList(), input).asObject()
}
