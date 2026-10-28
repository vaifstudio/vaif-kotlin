package studio.vaif

import studio.vaif.generated.OperationTable
import kotlinx.coroutines.*
import kotlinx.serialization.json.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OperationsTest {
    @Test fun `generated methods encode parameters flatten query and omit optional bodies`() = runBlocking {
        val fake = FakeTransport()
        fakeClient(fake).use { c ->
            c.operations.getProjectsByProjectIdApiKeys(path = mapOf("projectId" to "a/b ?#"))
            assertEquals("/projects/a%2Fb%20%3F%23/api-keys", fake.requests.last().url.encodedPath)
            c.operations.postSchemaEngineMigrationsByProjectIdByMigrationIdRollback(path = mapOf("projectId" to "p", "migrationId" to "m"))
            assertNull(fake.requests.last().body)
            val op = OperationTable.operations.values.first { it.path.endsWith("/aggregate") && it.path.startsWith("/v1/data/") }
            class Runtime(c: VaifClient) : OperationsBase(c) {
                suspend fun execute(op: Operation) = callJson(op, op.pathParams.associateWith { "test" },
                    obj("""{"filter":{"owner_id":"a b"},"fn":"count","unused":null}"""), null, emptyMap())
            }
            Runtime(c).execute(op)
            assertEquals("a b", fake.requests.last().url.queryParameter("filter[owner_id]"))
            assertNull(fake.requests.last().url.queryParameter("unused"))
        }
    }

    @Test fun `generated binary returns bytes without JSON parsing`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { HttpResponse(200, emptyMap(), byteArrayOf(0, -1, 5)) }
        fakeClient(fake).use { c ->
            assertArrayEquals(byteArrayOf(0, -1, 5), c.operations.getStorageDownload(query = obj("""{"bucket":"files","key":"a/b"}""")))
        }
    }

    @Test fun `MFA challenge requires explicit verification and tokens persist only after verification`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { req -> when {
            req.url.encodedPath.endsWith("/login") -> jsonResponse("""{"ok":true,"mfaRequired":true,"challengeToken":"challenge"}""")
            req.url.encodedPath.endsWith("/mfa/verify") -> {
                assertEquals(obj("""{"challengeToken":"challenge","code":"123456"}"""), obj(String(req.body!!)))
                jsonResponse("""{"accessToken":"verified","refreshToken":"rotated","user":{"id":"u"}}""")
            }
            else -> error("Unexpected route")
        } }
        fakeClient(fake).use { c ->
            val challenge = c.auth.signIn("u@example.test", "password") as AuthResult.MfaRequired
            assertNull(c.auth.session())
            assertTrue(c.auth.mfa.verify(challenge.challengeToken, "123456") is AuthResult.SignedIn)
            assertEquals("rotated", c.auth.session()?.refreshToken)
        }
    }

    @Test fun `refresh completing during signout cannot restore the removed session`() = runBlocking { supervisorScope {
        val entered = CompletableDeferred<Unit>()
        val release = CompletableDeferred<Unit>()
        val fake = FakeTransport()
        fake.handler = { req -> if (req.url.encodedPath.endsWith("/refresh")) {
            entered.complete(Unit); release.await(); jsonResponse("""{"accessToken":"new","refreshToken":"new-refresh"}""")
        } else jsonResponse("{}") }
        fakeClient(fake).use { c ->
            c.auth.setSession(Session("old", "old-refresh"))
            val refresh = async { c.auth.refresh() }
            entered.await()
            try { withTimeout(2000) { c.auth.signOut() } } finally { release.complete(Unit) }
            try { refresh.await(); fail<Unit>() }
            catch (e: VaifException) { assertEquals("SESSION_CHANGED", e.code) }
            assertNull(c.auth.session())
            assertEquals("old-refresh", obj(String(fake.requests.last().body!!)).string("refreshToken"))
        }
    } }

    @Test fun `console signout sends refresh cookie even when access token expired`() = runBlocking {
        val fake = FakeTransport()
        fakeClient(fake, projectId = null).use { c ->
            c.auth.setSession(Session("expired", "refresh;cookie=value"))
            c.auth.signOut()
            assertEquals("refresh_token=refresh%3Bcookie%3Dvalue", fake.requests.single().headers["Cookie"])
            assertNull(c.auth.session())
        }
    }

    @Test fun `signup pending verification is a successful result without replacing tokens`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { jsonResponse("""{"ok":true,"pendingVerification":true,"message":"Check your email to finish setting up your account."}""", 201) }
        fakeClient(fake).use { c ->
            c.auth.setSession(Session("existing", "refresh"))
            val result = c.auth.signUp("existing@example.test", "password") as AuthResult.PendingVerification
            assertEquals("Check your email to finish setting up your account.", result.message)
            assertEquals("existing", c.auth.session()?.accessToken)
        }
    }

    @Test fun `OAuth expired state fails before exchanging a code`() = runBlocking {
        val store = MemoryTokenStorage()
        val fake = FakeTransport()
        fakeClient(fake, store = store).use { c ->
            store.write("${c.storageKey}:oauth", """{"state":"expired","verifier":"secret","createdAt":1}""")
            try { c.auth.handleOAuthCallback("code", "expired"); fail<Unit>() }
            catch (e: VaifException) { assertEquals("OAUTH_STATE_MISMATCH", e.code) }
            assertTrue(fake.requests.isEmpty())
        }
    }
}
