package studio.vaif

import kotlinx.coroutines.*
import kotlinx.serialization.json.*
import okhttp3.HttpUrl.Companion.toHttpUrl
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FakeTransport : Transport {
    val requests = mutableListOf<HttpRequest>()
    var handler: suspend (HttpRequest) -> HttpResponse = { jsonResponse("{}") }
    override suspend fun execute(request: HttpRequest): HttpResponse {
        synchronized(requests) { requests.add(request) }
        return handler(request)
    }
}
internal fun jsonResponse(body: String, status: Int = 200) = HttpResponse(status, emptyMap(), body.toByteArray())
internal fun obj(text: String) = Json.parseToJsonElement(text).jsonObject
internal fun fakeClient(fake: FakeTransport, projectId: String? = "project", store: TokenStorage = MemoryTokenStorage()) =
    VaifClient(VaifConfig(projectId = projectId, apiKey = "vk_pub_test", tokenStorage = store), fake)

class CoreTest {
    @Test fun `console signup and password reset fail before network including operations`() = runBlocking {
        val fake = FakeTransport()
        fakeClient(fake, null).use { client ->
            for (call in listOf<suspend () -> Unit>(
                { client.auth.signUp("u@example.test", "password") },
                { client.auth.requestPasswordReset("u@example.test") },
                { client.auth.confirmPasswordReset("token", "password") },
                { client.operations.postAuthSignup(body = obj("{}")) },
                { client.operations.postAuthForgotPassword(body = obj("{}")) },
                { client.operations.postAuthResetPassword(body = obj("{}")) }
            )) {
                val error = try { call(); error("expected CONSOLE_ONLY") } catch (e: VaifConsoleOnlyError) { e }
                assertEquals("CONSOLE_ONLY", error.code)
                assertTrue(error.consoleUrl.startsWith("https://console.vaif.studio/"))
            }
            assertTrue(fake.requests.isEmpty())
        }
    }

    @Test fun `login persists rotated refresh token and MFA never overwrites a session`() = runBlocking {
        val fake = FakeTransport()
        val store = MemoryTokenStorage()
        var refreshes = 0
        fake.handler = { req -> when {
            req.url.encodedPath.endsWith("/login") -> jsonResponse("""{"accessToken":"a1","refreshToken":"r1","user":{"id":"u"}}""")
            req.url.encodedPath.endsWith("/refresh") -> {
                refreshes++
                assertEquals("r1", obj(String(req.body!!))["refreshToken"]!!.jsonPrimitive.content)
                delay(30)
                jsonResponse("""{"accessToken":"a2","refreshToken":"r2","expiresIn":60}""")
            }
            req.url.encodedPath.endsWith("/me") -> jsonResponse("""{"user":{"id":"u"}}""")
            req.url.encodedPath.endsWith("/oauth/token") -> jsonResponse("""{"mfaRequired":true,"challengeToken":"challenge"}""")
            else -> jsonResponse("{}")
        } }
        fakeClient(fake, store = store).use { client ->
            assertTrue(client.auth.signIn("u@example.test", "pw") is AuthResult.SignedIn)
            val sessions = coroutineScope { List(10) { async { client.auth.refresh() } }.awaitAll() }
            assertEquals(1, refreshes)
            assertTrue(sessions.all { it.refreshToken == "r2" })
            client.auth.getUser()
            assertEquals("Bearer a2", fake.requests.last().headers["Authorization"])
            assertEquals("body", fake.requests.first().headers["X-Vaif-Refresh-Mode"])
            client.auth.signOut()
            assertNull(client.auth.session())
        }
        fakeClient(fake, store = store).use { assertNull(it.auth.session()) }
    }

    @Test fun `OAuth uses S256 state expiry and single use`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { req -> if (req.url.encodedPath.endsWith("/start")) jsonResponse("""{"url":"https://provider.test/consent"}""")
            else jsonResponse("""{"accessToken":"a","refreshToken":"r","user":{"id":"u"}}""") }
        fakeClient(fake).use { c ->
            val started = c.auth.startOAuth("google", "myapp://callback")
            val body = obj(String(fake.requests.last().body!!))
            assertEquals("S256", body["codeChallengeMethod"]!!.jsonPrimitive.content)
            assertEquals(43, body["codeChallenge"]!!.jsonPrimitive.content.length)
            val before = fake.requests.size
            try { c.auth.handleOAuthCallback("code", "unknown"); fail<Unit>() } catch (e: VaifException) { assertEquals("OAUTH_STATE_MISMATCH", e.code) }
            assertEquals(before, fake.requests.size)
            assertTrue(c.auth.handleOAuthCallback("code", started.state) is AuthResult.SignedIn)
            try { c.auth.handleOAuthCallback("code", started.state); fail<Unit>() } catch (e: VaifException) { assertEquals("OAUTH_STATE_MISMATCH", e.code) }
        }
    }

    @Test fun `query is immutable and uses the API wire format`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { jsonResponse("""{"data":[],"count":0}""") }
        fakeClient(fake).use { c ->
            val base = c.from("notes")
            base.select("id", "body").eq("owner_id", "u").gt("score", 3).order("score", false).order("id").range(5, 9).list()
            val url = fake.requests.last().url
            assertEquals("/v1/data/project/notes", url.encodedPath)
            assertEquals("5", url.queryParameter("limit"))
            assertEquals("5", url.queryParameter("offset"))
            assertEquals("score,id", url.queryParameter("orderBy"))
            assertEquals("desc,asc", url.queryParameter("orderDir"))
            assertTrue(obj(url.queryParameter("where")!!).containsKey("AND"))
            base.list()
            assertNull(fake.requests.last().url.query)
            val before = fake.requests.size
            try { base.gt("score", 1).update(obj("""{"body":"x"}""")); fail<Unit>() } catch (e: VaifException) { assertEquals("VALIDATION_ERROR", e.code) }
            assertEquals(before, fake.requests.size)
            try { base.delete(); fail<Unit>() } catch (e: VaifException) { assertEquals("VALIDATION_ERROR", e.code) }
            base.upsert(obj("""{"id":"x","body":"hi"}"""), listOf("id"))
            assertEquals(JsonPrimitive(true), obj(String(fake.requests.last().body!!))["_upsert"])
            base.get("a/b ?#")
            assertEquals("/v1/data/project/notes/a%2Fb%20%3F%23", fake.requests.last().url.encodedPath)
        }
    }

    @Test fun `uploads require exact size and signed transfers never carry credentials`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { req -> when (req.url.encodedPath) {
            "/storage/upload-url", "/storage/download-url" -> jsonResponse("""{"url":"https://files.example.test/file?signature=private"}""")
            else -> HttpResponse(200, emptyMap(), "hello".toByteArray())
        } }
        fakeClient(fake).use { c ->
            c.auth.setSession(Session("access", "refresh"))
            try { c.storage.upload("key", "hello".toByteArray(), 3); fail<Unit>() } catch (e: VaifException) { assertEquals("VALIDATION_ERROR", e.code) }
            assertTrue(fake.requests.isEmpty())
            c.storage.upload("key", "hello".toByteArray(), 5, "text/plain")
            assertEquals(5, obj(String(fake.requests.first().body!!))["sizeBytes"]!!.jsonPrimitive.int)
            assertEquals(mapOf("Content-Type" to "text/plain"), fake.requests.last().headers)
            assertArrayEquals("hello".toByteArray(), c.storage.download("key"))
            assertTrue(fake.requests.last().headers.isEmpty())
        }
    }

    @Test fun `API errors preserve status code request id and legacy error strings`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { jsonResponse("""{"error":"expired","code":"TOKEN_INVALID","requestId":"req-1"}""", 401) }
        fakeClient(fake).use { c ->
            try { c.from("notes").list(); fail<Unit>() } catch (e: VaifException) {
                assertEquals(401, e.status)
                assertEquals("TOKEN_INVALID", e.code)
                assertEquals("req-1", e.requestId)
            }
        }
    }
}
