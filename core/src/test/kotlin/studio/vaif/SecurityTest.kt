package studio.vaif

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.first
import kotlinx.serialization.json.*
import okhttp3.*
import okhttp3.mockwebserver.*
import okio.Buffer
import okio.BufferedSource
import okio.Source
import okio.Timeout
import okio.buffer
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.IOException
import java.util.concurrent.TimeUnit

class SecurityTest {
    @Test fun `URLs reject insecure remote hosts and invalid schemes with SDK errors`() {
        for (url in listOf("http://remote.test", "ftp://localhost", "wss://remote.test", "not a URL", "https://u:p@remote.test")) {
            assertThrows(VaifException::class.java) { VaifClient(VaifConfig(baseUrl = url)).close() }
        }
        for (url in listOf("http://localhost", "http://127.0.0.1", "http://[::1]", "HTTPS://remote.test")) {
            VaifClient(VaifConfig(baseUrl = url)).use { c ->
                val expected = if (url.startsWith("HTTPS")) "wss://remote.test/realtime/ws" else url + "/realtime/ws"
                assertEquals(expected.replace("http://", "ws://"), c.realtimeUrl())
            }
        }
    }

    @Test fun `signed URL helpers reject insecure targets before returning them`() = runBlocking {
        val fake = FakeTransport()
        fakeClient(fake).use { c ->
            for (url in listOf("http://remote.test/object", "ftp://localhost/object", "invalid")) {
                fake.handler = { jsonResponse(jsonObject("url" to JsonPrimitive(url)).toString()) }
                for (call in listOf<suspend () -> Unit>(
                    { c.storage.getUploadUrl("key", 1) }, { c.storage.getDownloadUrl("key") },
                    { c.storage.createSignedUrl("key") }, { c.storage.upload("key", byteArrayOf(1), 1) }
                )) {
                    try { call(); fail<Unit>("Expected unsafe URL rejection") }
                    catch (e: VaifException) { assertEquals("VALIDATION_ERROR", e.code) }
                }
            }
            assertTrue(fake.requests.all { it.url.host == "api.vaif.studio" })
        }
    }

    @Test fun `signed transfer errors never repeat the file host response`() = runBlocking {
        val signed = "https://files.example.test/object?X-Amz-Signature=private-signature"
        val fake = FakeTransport()
        fake.handler = { req -> when (req.url.encodedPath) {
            "/storage/upload-url", "/storage/download-url" -> jsonResponse(jsonObject("url" to JsonPrimitive(signed)).toString())
            else -> jsonResponse(jsonObject("message" to JsonPrimitive("Denied $signed"), "code" to JsonPrimitive(signed),
                "requestId" to JsonPrimitive(signed), "details" to JsonPrimitive(signed)).toString(), 403)
        } }
        fakeClient(fake).use { c ->
            for (call in listOf<suspend () -> Unit>({ c.storage.upload("key", byteArrayOf(1), 1) }, { c.storage.download("key") })) {
                try { call(); fail<Unit>("Expected a failed transfer") }
                catch (e: VaifException) {
                    assertEquals("STORAGE_TRANSFER_FAILED", e.code)
                    assertEquals(403, e.status)
                    assertEquals("The storage transfer failed (HTTP 403)", e.message)
                    assertNull(e.requestId)
                    assertNull(e.details)
                }
            }
            assertEquals(4, fake.requests.size)
        }
    }

    @Test fun `logout finishes while refresh is pending and late refresh cannot restore tokens`() = runBlocking {
        supervisorScope {
            val entered = CompletableDeferred<Unit>()
            val release = CompletableDeferred<Unit>()
            val fake = FakeTransport()
            fake.handler = { req -> if (req.url.encodedPath.endsWith("/refresh")) {
                entered.complete(Unit); release.await(); jsonResponse("""{"accessToken":"late","refreshToken":"late-r"}""")
            } else jsonResponse("{}") }
            fakeClient(fake).use { c ->
                c.auth.setSession(Session("expired", "refresh"))
                val refresh = async { c.auth.refresh() }
                try {
                    withTimeout(2000) { entered.await(); c.auth.signOut() }
                    assertEquals("refresh", obj(String(fake.requests.last().body!!)).string("refreshToken"))
                } finally { release.complete(Unit) }
                try { refresh.await(); fail<Unit>("Expected stale refresh rejection") }
                catch (e: VaifException) { assertEquals("SESSION_CHANGED", e.code) }
                assertNull(c.auth.session())
            }
        }
    }

    @Test fun `refresh cannot overwrite a replacement session even when tokens are identical`() = runBlocking {
        supervisorScope {
            val entered = CompletableDeferred<Unit>()
            val release = CompletableDeferred<Unit>()
            val fake = FakeTransport()
            fake.handler = { entered.complete(Unit); release.await(); jsonResponse("""{"accessToken":"late","refreshToken":"late-r"}""") }
            fakeClient(fake).use { c ->
                val original = Session("original", "original-r")
                c.auth.setSession(original)
                val refresh = async { c.auth.refresh() }
                try { withTimeout(2000) { entered.await(); c.auth.setSession(original) } }
                finally { release.complete(Unit) }
                try { refresh.await(); fail<Unit>() }
                catch (e: VaifException) { assertEquals("SESSION_CHANGED", e.code) }
                assertEquals(original, c.auth.session())
            }
        }
    }

    @Test fun `failed save removes the previous persisted session across client restart`() = runBlocking {
        for (operation in listOf("signIn", "setSession", "refresh")) {
            val memory = MemoryTokenStorage()
            var reject = false
            val storage = object : TokenStorage {
                override suspend fun read(key: String) = memory.read(key)
                override suspend fun write(key: String, value: String?) {
                    if (reject && value != null) throw IOException("disk full")
                    memory.write(key, value)
                }
            }
            val fake = FakeTransport().apply { handler = { jsonResponse("""{"accessToken":"new","refreshToken":"new-r"}""") } }
            fakeClient(fake, store = storage).use { c ->
                c.auth.setSession(Session("old", "old-r")); reject = true
                try {
                    when (operation) {
                        "signIn" -> c.auth.signIn("u@example.test", "pw")
                        "setSession" -> c.auth.setSession(Session("new", "new-r"))
                        else -> c.auth.refresh()
                    }
                    fail<Unit>()
                }
                catch (e: VaifException) { assertEquals("STORAGE_ERROR", e.code) }
                assertNull(c.auth.session())
            }
            fakeClient(fake, store = storage).use { assertNull(it.auth.session()) }
        }
    }

    @Test fun `logout reports persistent removal failure and blocks the local session`() = runBlocking {
        val memory = MemoryTokenStorage()
        var reject = false
        val storage = object : TokenStorage {
            override suspend fun read(key: String) = memory.read(key)
            override suspend fun write(key: String, value: String?) {
                if (reject) throw IOException("read-only store")
                memory.write(key, value)
            }
        }
        fakeClient(FakeTransport(), store = storage).use { c ->
            c.auth.setSession(Session("expired", "refresh")); reject = true
            try { c.auth.signOut(); fail<Unit>() }
            catch (e: VaifException) { assertEquals("STORAGE_ERROR", e.code) }
            assertNull(c.auth.session())
        }
    }

    @Test fun `persistent store keys isolate API origins and projects`() = runBlocking {
        val storage = MemoryTokenStorage()
        val fake = FakeTransport()
        VaifClient(VaifConfig(projectId = "p", baseUrl = "https://one.test", tokenStorage = storage), fake).use { a ->
            a.auth.setSession(Session("one", "r"))
            for ((origin, project) in listOf("https://two.test" to "p", "https://one.test" to "q")) {
                VaifClient(VaifConfig(projectId = project, baseUrl = origin, tokenStorage = storage), fake).use { assertNull(it.auth.session()) }
            }
            VaifClient(VaifConfig(projectId = "p", baseUrl = "HTTPS://ONE.TEST:443", tokenStorage = storage), fake).use {
                assertEquals("one", it.auth.session()?.accessToken)
            }
        }
    }

    @Test fun `function and API auth layer 401 responses are never implicitly replayed`() = runBlocking {
        for (code in listOf("FUNCTION_UNAUTHORIZED", "TOKEN_INVALID")) {
            val fake = FakeTransport().apply { handler = { jsonResponse("""{"code":"$code","error":"denied"}""", 401) } }
            fakeClient(fake).use { c ->
                c.auth.setSession(Session("a", "r"))
                try { c.functions.invoke("own-401"); fail<Unit>() }
                catch (e: VaifException) { assertEquals(code, e.code); assertEquals(401, e.status) }
                assertEquals(1, fake.requests.size)
            }
        }
    }

    @Test fun `cross origin redirects cannot forward auth or API keys`() = runBlocking {
        MockWebServer().use { target -> MockWebServer().use { api ->
            target.start()
            api.enqueue(MockResponse().setResponseCode(307).addHeader("Location", target.url("/stolen")))
            VaifClient(VaifConfig(projectId = "p", apiKey = "secret", baseUrl = api.url("/").toString())).use { c ->
                c.auth.setSession(Session("access", "refresh"))
                try { c.from("notes").list(); fail<Unit>() } catch (e: VaifException) { assertEquals(307, e.status) }
                assertEquals("Bearer access", api.takeRequest().getHeader("Authorization"))
                assertNull(target.takeRequest(200, TimeUnit.MILLISECONDS))
            }
        } }
    }

    @Test fun `realtime transport failure is an SDK error`() = runBlocking {
        MockWebServer().use { server ->
            server.enqueue(MockResponse().setResponseCode(503))
            VaifClient(VaifConfig(projectId = "p", baseUrl = server.url("/").toString())).use { c ->
                try { withTimeout(3000) { c.realtime("notes").events.first() }; fail<Unit>() }
                catch (e: VaifException) { assertEquals("REALTIME_CONNECTION_FAILED", e.code) }
            }
        }
    }

    @Test fun `event stream open and read failures use SDK errors`() = runBlocking {
        class Runtime(c: VaifClient) : OperationsBase(c) {
            suspend fun stream() = callStream(Operation("events", "GET", "/events", emptyList(), emptyList(), null, false, "sse", false, false), emptyMap(), JsonObject(emptyMap()), null, emptyMap())
        }
        for (failOnOpen in listOf(true, false)) {
            val transport = object : Transport {
                override suspend fun execute(request: HttpRequest): HttpResponse = error("unused")
                override suspend fun stream(request: HttpRequest): Response {
                    if (failOnOpen) throw IOException("connection failed")
                    val body = object : ResponseBody() {
                        override fun contentType(): MediaType? = null
                        override fun contentLength() = -1L
                        override fun source(): BufferedSource = object : Source {
                            override fun read(sink: Buffer, byteCount: Long): Long = throw IOException("stream disconnected")
                            override fun timeout() = Timeout.NONE
                            override fun close() = Unit
                        }.buffer()
                    }
                    return Response.Builder().request(Request.Builder().url(request.url).build()).protocol(Protocol.HTTP_1_1).code(200).message("OK").body(body).build()
                }
            }
            VaifClient(VaifConfig(), transport).use { c ->
                try { Runtime(c).stream().use { it.body!!.string() }; fail<Unit>() }
                catch (e: VaifException) { assertEquals("NETWORK_ERROR", e.code) }
            }
        }
    }
}
