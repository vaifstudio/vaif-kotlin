package studio.vaif

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.onEach
import kotlinx.serialization.json.*
import okhttp3.*
import okhttp3.mockwebserver.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/** Executes the shared contract cases through the Kotlin modules.
 * The stateful server model checks wire contracts; it does not prove real API authorization or quota behavior.
 */
class ConformanceTest {
    @TestFactory fun sharedCases(): List<DynamicTest> {
        val text = requireNotNull(javaClass.getResourceAsStream("/conformance/core.json")) {
            "Missing shared conformance test resource"
        }.bufferedReader().use { it.readText() }
        val document = vaifJson.parseToJsonElement(text).jsonObject
        require(document["version"]?.jsonPrimitive?.int == 1)
        return document.getValue("cases").jsonArray.map { definition ->
            val case = definition.jsonObject
            DynamicTest.dynamicTest(case.getValue("id").jsonPrimitive.content) { runBlocking { runCase(case) } }
        }
    }

    private fun valueAt(value: JsonElement, path: String): JsonElement = path.split('.').fold(value) { v, key ->
        (v as? JsonObject)?.get(key) ?: error("Missing expectation path $path")
    }
    private fun resolve(value: JsonElement, state: JsonObject): JsonElement = when (value) {
        is JsonObject -> JsonObject(value.mapValues { resolve(it.value, state) })
        is JsonArray -> JsonArray(value.map { resolve(it, state) })
        is JsonPrimitive -> if (value.isString && value.content.startsWith("$")) valueAt(state, value.content.drop(1)) else value
    }
    private fun checkExpected(result: JsonElement, expected: JsonObject, state: JsonObject) {
        require(expected.keys.all { it in setOf("has", "equals", "length", "includesKey") }) { "Unknown conformance assertion" }
        (expected["has"] as? JsonArray)?.forEach { assertNotEquals(JsonNull, valueAt(result, it.jsonPrimitive.content)) }
        (expected["equals"] as? JsonObject)?.forEach { (key, value) -> assertEquals(resolve(value, state), valueAt(result, key), key) }
        (expected["length"] as? JsonObject)?.forEach { (key, value) -> assertEquals(value.jsonPrimitive.int, valueAt(result, key).jsonArray.size, key) }
        expected["includesKey"]?.let { key -> assertTrue(result.jsonObject.getValue("files").jsonArray.any { it.jsonObject["key"] == key }) }
    }
    private suspend fun runCase(case: JsonObject) {
        val definition = case.getValue("setup").jsonObject
        require(definition.getValue("fixture").jsonPrimitive.content == "core")
        require(definition.getValue("table").jsonObject.getValue("ownerRule").jsonPrimitive.content == "-- vaif:owner owner_id")
        val fake = StatefulApi()
        val actors = listOf("alice", "bob", "service").associateWith { actor ->
            VaifClient(VaifConfig(projectId = "project", apiKey = if (actor == "service") "service-key" else "anon-key", baseUrl = "http://localhost:3010"), fake)
        }
        val state = mutableMapOf<String, JsonElement>()
        try {
            for (element in case.getValue("steps").jsonArray) {
                val step = element.jsonObject
                val expected = step.getValue("expect").jsonObject
                val args = resolve(step["args"] ?: JsonObject(emptyMap()), JsonObject(state)).jsonObject
                val client = actors.getValue(step.string("actor") ?: "service")
                suspend fun operate(): JsonElement {
                    val table = client.from("notes")
                    return when (step.string("op")) {
                        "signUp" -> (client.auth.signUp("${step.string("actor")}@vaif-local.test", "Local-Password!Aa1234") as AuthResult.SignedIn).session.let {
                            jsonObject("accessToken" to JsonPrimitive(it.accessToken), "user" to it.user)
                        }
                        "setAuth" -> { client.auth.setSession(Session(args.getValue("token").jsonPrimitive.content)); JsonNull }
                        "createRow" -> table.insert(args).getValue("data")
                        "listRows" -> table.list()
                        "getRow" -> table.get(args.getValue("id").jsonPrimitive.content).getValue("data")
                        "updateRow" -> table.update(args.getValue("id").jsonPrimitive.content, args.getValue("values").jsonObject).getValue("data")
                        "deleteRow" -> table.delete(args.getValue("id").jsonPrimitive.content)
                        "rotateSigningKey" -> client.operations.postProjectsByProjectIdSettingsJwtRotate(path = mapOf("projectId" to "project"))
                        "storageUpload" -> args.getValue("text").jsonPrimitive.content.toByteArray().let { client.storage.upload(args.getValue("key").jsonPrimitive.content, it, it.size.toLong(), "text/plain") }
                        "storageDownload" -> jsonObject("text" to JsonPrimitive(String(client.storage.download(args.getValue("key").jsonPrimitive.content))))
                        "storageList" -> client.storage.list()
                        "invokeFunction" -> client.functions.invoke(args.getValue("name").jsonPrimitive.content).getValue("data")
                        "realtimeRoundTrip" -> realtimeRoundTrip(fake)
                        else -> error("Unknown conformance operation ${step.string("op")}")
                    }
                }
                val expectedError = expected["error"] as? JsonObject
                if (expectedError != null) {
                    try { operate(); fail<Unit>("Expected conformance error") }
                    catch (error: VaifException) {
                        assertEquals(expectedError.getValue("status").jsonPrimitive.int, error.status)
                        assertEquals(expectedError.getValue("code").jsonPrimitive.content, error.code)
                    }
                } else {
                    val result = operate()
                    checkExpected(result, expected, JsonObject(state))
                    step.string("as")?.let { state[it] = result }
                }
            }
        } finally { actors.values.forEach { it.close() } }
    }
    /** Inserts only after the client itself has observed the channel acknowledgment, so the change cannot race the subscription. */
    private suspend fun realtimeRoundTrip(fake: StatefulApi): JsonObject {
        MockWebServer().use { server ->
            val peer = CompletableDeferred<WebSocket>()
            server.enqueue(MockResponse().withWebSocketUpgrade(object : WebSocketListener() {
                override fun onMessage(webSocket: WebSocket, text: String) {
                    val frame = obj(text)
                    if (frame.string("type") == "auth") webSocket.send("""{"type":"welcome","projectId":"project"}""")
                    if (frame.string("type") == "subscribe") {
                        peer.complete(webSocket)
                        webSocket.send("""{"type":"subscribed","channel":"table:notes","ok":true}""")
                    }
                }
            }))
            val socketClient = OkHttpClient()
            try {
                VaifClient(VaifConfig(projectId = "project", apiKey = "service-key", baseUrl = server.url("/").toString()), fake).use { c ->
                    return coroutineScope {
                        val acknowledged = CompletableDeferred<Unit>()
                        val event = async {
                            c.realtimeWithClient("notes", socketClient).events
                                .onEach { if (it.string("type") == "subscribed") acknowledged.complete(Unit) }
                                .first { it.string("type") == "db_change" }
                        }
                        within("the client to receive the table:notes subscription acknowledgment") { acknowledged.await() }
                        val socket = peer.await() // completed before the server sent the acknowledgment
                        fake.onInsert = { row -> socket.send(jsonObject("type" to JsonPrimitive("db_change"), "table" to JsonPrimitive("notes"), "op" to JsonPrimitive("INSERT"), "record" to row).toString()) }
                        c.from("notes").insert(obj("""{"body":"realtime note"}"""))
                        within("the client to receive the db_change event for the inserted row") { event.await() }
                    }
                }
            } finally {
                fake.onInsert = null
                socketClient.dispatcher.executorService.shutdown()
                socketClient.connectionPool.evictAll()
            }
        }
    }
    private suspend fun <T : Any> within(what: String, block: suspend () -> T): T =
        withTimeoutOrNull(REALTIME_STEP_TIMEOUT_MS) { block() } ?: fail("Timed out after $REALTIME_STEP_TIMEOUT_MS ms waiting for $what")
    private companion object { const val REALTIME_STEP_TIMEOUT_MS = 10_000L }
}

private class StatefulApi : Transport {
    private val rows = linkedMapOf<String, JsonObject>()
    private val files = linkedMapOf<String, ByteArray>()
    private var generation = 1
    var onInsert: ((JsonObject) -> Unit)? = null
    override suspend fun execute(request: HttpRequest): HttpResponse {
        val path = request.url.encodedPath
        val body = request.body?.let { runCatching { obj(String(it)) }.getOrNull() } ?: JsonObject(emptyMap())
        val token = request.headers["Authorization"]?.removePrefix("Bearer ")
        fun response(value: JsonElement) = jsonResponse(value.toString())
        if (path.endsWith("/auth/signup")) {
            check(request.headers["X-Vaif-Refresh-Mode"] == "body")
            val user = body.getValue("email").jsonPrimitive.content.substringBefore('@')
            return response(jsonObject("accessToken" to JsonPrimitive("$user:$generation"), "refreshToken" to JsonPrimitive("r:$user:$generation"), "user" to jsonObject("id" to JsonPrimitive(user))))
        }
        if (path.endsWith("/settings/jwt/rotate")) { generation++; return jsonResponse("{}") }
        if (path == "/storage/upload-url" || path == "/storage/download-url") {
            if (path == "/storage/upload-url") require(body.getValue("sizeBytes").jsonPrimitive.long > 0)
            return response(jsonObject("url" to JsonPrimitive("http://localhost:3999/files/${body.getValue("key").jsonPrimitive.content}")))
        }
        if (path.startsWith("/files/")) {
            check(request.headers.keys.none { it.equals("Authorization", true) || it.equals("x-vaif-key", true) })
            val key = request.url.pathSegments.drop(1).joinToString("/")
            if (request.method == "PUT") { files[key] = request.body!!; return HttpResponse(200, emptyMap(), ByteArray(0)) }
            return HttpResponse(200, emptyMap(), files.getValue(key))
        }
        if (path == "/storage/buckets") return jsonResponse("""{"buckets":[{"id":"00000000-0000-0000-0000-000000000001","name":"default"}]}""")
        if (path.startsWith("/buckets/") && path.endsWith("/files")) return response(jsonObject("files" to JsonArray(files.keys.map { jsonObject("key" to JsonPrimitive(it)) })))
        if (path == "/functions/hello_world/invoke") return jsonResponse("""{"data":{"message":"Hello from VAIF Functions!"}}""")
        if (path.startsWith("/v1/data/project/notes")) {
            val service = request.headers["x-vaif-key"] == "service-key"
            if (!service && (token == null || token.substringAfter(':') != generation.toString())) return jsonResponse("""{"code":"TOKEN_INVALID","error":"Invalid token"}""", 401)
            val user = token?.substringBefore(':')
            val id = request.url.pathSegments.getOrNull(4)
            when (request.method) {
                "POST" -> {
                    check(id == null)
                    val rowId = "row-${rows.size + 1}"
                    val row = JsonObject(body + mapOf("id" to JsonPrimitive(rowId), "owner_id" to JsonPrimitive(user ?: "service")))
                    rows[rowId] = row; onInsert?.invoke(row); return response(jsonObject("data" to row))
                }
                "GET" -> if (id == null) {
                    val data = rows.values.filter { service || it.string("owner_id") == user }
                    return response(jsonObject("data" to JsonArray(data), "count" to JsonPrimitive(data.size)))
                }
                else -> Unit
            }
            val row = rows[id] ?: return jsonResponse("{}", 404)
            if (!service && row.string("owner_id") != user) return jsonResponse("{}", 404)
            return when (request.method) {
                "GET" -> response(jsonObject("data" to row))
                "PATCH" -> response(jsonObject("data" to JsonObject(row + body).also { rows[id!!] = it }))
                "DELETE" -> { rows.remove(id); response(jsonObject("data" to jsonObject("id" to JsonPrimitive(id)), "deleted" to JsonPrimitive(true))) }
                else -> error("Unsupported data request")
            }
        }
        error("Unexpected fake request: ${request.method} $path")
    }
}
