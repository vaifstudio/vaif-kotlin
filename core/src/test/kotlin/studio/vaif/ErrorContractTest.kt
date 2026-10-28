package studio.vaif

import kotlinx.coroutines.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.IOException

class ErrorContractTest {
    private suspend fun assertCode(code: String, call: suspend () -> Unit) {
        try { call(); fail<Unit>("Expected $code") }
        catch (e: VaifException) { assertEquals(code, e.code) }
    }

    @Test fun `responses with an unexpected JSON shape are SDK errors`() = runBlocking {
        val fake = FakeTransport().apply { handler = { jsonResponse("[]") } }
        fakeClient(fake).use { c ->
            c.auth.setSession(Session("access", "refresh"))
            for (call in listOf<suspend () -> Unit>(
                { c.from("notes").list() }, { c.from("notes").get("id") }, { c.from("notes").insert(obj("{}")) },
                { c.from("notes").delete("id") }, { c.from("notes").count() }, { c.functions.invoke("hello") },
                { c.storage.getDownloadUrl("key") }, { c.storage.list("bucket-name") }, { c.storage.delete("key", "00000000-0000-0000-0000-000000000001") },
                { c.auth.getUser() }, { c.auth.signIn("u@example.test", "pw") }, { c.auth.refresh() }, { c.auth.mfa.enrollStart() },
                { c.auth.startOAuth("google", "myapp://callback") }, { c.auth.listOAuthProviders() },
            )) assertCode("INVALID_RESPONSE", call)
            for (body in listOf("""{"mfaRequired":{},"accessToken":"a"}""", """{"accessToken":"a","expiresIn":[]}""", """{"accessToken":{}}""")) {
                fake.handler = { jsonResponse(body) }
                assertCode("INVALID_RESPONSE") { c.auth.signIn("u@example.test", "pw") }
            }
            fake.handler = { jsonResponse("""{"user":"u"}""") }
            assertCode("INVALID_RESPONSE") { c.auth.getUser() }
            fake.handler = { jsonResponse("""{"buckets":[1]}""") }
            assertCode("INVALID_RESPONSE") { c.storage.list("bucket-name") }
            fake.handler = { jsonResponse("""{"data":[1]}""") }
            assertCode("INVALID_RESPONSE") { c.from("notes").count() }
            assertEquals(Session("access", "refresh"), c.auth.session())
        }
    }

    @Test fun `malformed AND filters are validation errors before any request`() = runBlocking {
        val fake = FakeTransport()
        fakeClient(fake).use { c ->
            for (filter in listOf("""{"AND":{}}""", """{"AND":[1]}""")) {
                assertCode("VALIDATION_ERROR") { c.from("notes").where(obj(filter)).delete() }
            }
            assertTrue(fake.requests.isEmpty())
        }
    }

    @Test fun `OAuth flow storage failures are SDK storage errors`() = runBlocking {
        for (failure in listOf("write", "read", "corrupt")) {
            val memory = MemoryTokenStorage()
            val storage = object : TokenStorage {
                override suspend fun read(key: String): String? {
                    if (failure == "read" && key.endsWith(":oauth")) throw IOException("locked")
                    return memory.read(key)
                }
                override suspend fun write(key: String, value: String?) {
                    if (failure == "write" && key.endsWith(":oauth")) throw IOException("locked")
                    memory.write(key, value)
                }
            }
            val fake = FakeTransport().apply { handler = { jsonResponse("""{"url":"https://provider.test/consent"}""") } }
            fakeClient(fake, store = storage).use { c ->
                if (failure == "corrupt") memory.write("${c.storageKey}:oauth", "{not json")
                if (failure == "write") assertCode("STORAGE_ERROR") { c.auth.startOAuth("google", "myapp://callback") }
                else assertCode("STORAGE_ERROR") { c.auth.handleOAuthCallback("code", "state") }
            }
        }
    }

    @Test fun `closing the client during a refresh reports an SDK error to a caller that is still active`() = runBlocking {
        val entered = CompletableDeferred<Unit>()
        val fake = FakeTransport().apply { handler = { entered.complete(Unit); awaitCancellation() } }
        val client = fakeClient(fake)
        client.auth.setSession(Session("access", "refresh"))
        val refresh = async { runCatching { client.auth.refresh() } }
        withTimeout(2000) { entered.await() }
        client.close()
        val error = withTimeout(2000) { refresh.await() }.exceptionOrNull()
        assertTrue(error is VaifException, "Expected VaifException, got $error")
        assertEquals("CLIENT_CLOSED", (error as VaifException).code)
        assertTrue(isActive)
    }
}
