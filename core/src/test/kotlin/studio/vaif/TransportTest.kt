package studio.vaif

import kotlinx.coroutines.*
import okhttp3.mockwebserver.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit

class TransportTest {
    @Test fun `API redirects are surfaced and never followed`() = runBlocking {
        MockWebServer().use { server ->
            server.enqueue(MockResponse().setResponseCode(307).addHeader("Location", server.url("/unexpected")))
            VaifClient(VaifConfig(projectId = "p", apiKey = "key", baseUrl = server.url("/").toString())).use { c ->
                try { c.from("notes").list(); fail<Unit>() }
                catch (e: VaifException) { assertEquals(307, e.status) }
                assertEquals(1, server.requestCount)
            }
        }
    }
    @Test fun `cancelled buffered HTTP read releases its active call`() = runBlocking {
        MockWebServer().use { server ->
            server.enqueue(MockResponse().setSocketPolicy(SocketPolicy.NO_RESPONSE))
            OkHttpTransport().use { transport ->
                val job = launch { transport.execute(HttpRequest("GET", server.url("/slow"))) }
                withContext(Dispatchers.IO) { assertNotNull(server.takeRequest(2, TimeUnit.SECONDS)) }
                withTimeout(2000) { job.cancelAndJoin() }
                withTimeout(2000) { while (transport.client.dispatcher.runningCallsCount() != 0) delay(10) }
            }
        }
    }
    @Test fun `logout cancellation still clears a suspending persistent store`() = runBlocking {
        val memory = MemoryTokenStorage()
        val storage = object : TokenStorage {
            override suspend fun read(key: String) = memory.read(key)
            override suspend fun write(key: String, value: String?) { delay(1); memory.write(key, value) }
        }
        val entered = CompletableDeferred<Unit>()
        val fake = FakeTransport()
        fake.handler = { entered.complete(Unit); awaitCancellation() }
        fakeClient(fake, store = storage).use { c ->
            c.auth.setSession(Session("access", "refresh"))
            val logout = launch { c.auth.signOut() }
            entered.await(); logout.cancelAndJoin()
            assertNull(c.auth.session())
        }
    }
}
