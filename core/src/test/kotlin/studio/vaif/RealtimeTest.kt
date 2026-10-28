package studio.vaif

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.serialization.json.*
import okhttp3.*
import okhttp3.mockwebserver.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit

class RealtimeTest {
    @Test fun `auth precedes welcome and subscription then delivers INSERT without URL credentials`() = runBlocking {
        val frames = java.util.concurrent.CopyOnWriteArrayList<JsonObject>()
        MockWebServer().use { server ->
            server.enqueue(MockResponse().withWebSocketUpgrade(object : WebSocketListener() {
                override fun onMessage(webSocket: WebSocket, text: String) {
                    val frame = obj(text); frames.add(frame)
                    when (frame.string("type")) {
                        "auth" -> webSocket.send("""{"type":"welcome","projectId":"project","heartbeatIntervalMs":30000}""")
                        "subscribe" -> {
                            assertEquals("table:notes?owner_id.eq=u&columns=id%2Cbody", frame.string("channel"))
                            webSocket.send(jsonObject("type" to JsonPrimitive("subscribed"), "channel" to frame["channel"], "ok" to JsonPrimitive(true)).toString())
                            webSocket.send("""{"type":"db_change","table":"notes","channels":["table:notes?owner_id.eq=u&columns=id%2Cbody"],"op":"INSERT","record":{"id":"one"}}""")
                        }
                    }
                }
            }))
            VaifClient(VaifConfig(projectId = "project", apiKey = "public-key", baseUrl = server.url("/").toString())).use { c ->
                c.auth.setSession(Session("access", "refresh"))
                val subscription = c.realtime("notes", listOf(RealtimeFilter("owner_id", "eq", "u")), listOf("id", "body"))
                val event = withTimeout(5000) { subscription.changes.first() }
                assertEquals("INSERT", event.string("op"))
                assertEquals(listOf("auth", "subscribe"), frames.map { it.string("type") })
                assertEquals("access", frames[0].string("accessToken"))
                val upgrade = server.takeRequest(1, TimeUnit.SECONDS)!!
                assertEquals("/realtime/ws", upgrade.path)
                assertNull(upgrade.getHeader("Authorization"))
                assertNull(upgrade.getHeader("x-vaif-key"))
            }
        }
    }

    @Test fun `server subscription error reaches collector`() = runBlocking {
        MockWebServer().use { server ->
            server.enqueue(MockResponse().withWebSocketUpgrade(object : WebSocketListener() {
                override fun onMessage(webSocket: WebSocket, text: String) {
                    if (obj(text).string("type") == "auth") webSocket.send("""{"type":"welcome"}""")
                    else webSocket.send("""{"type":"error","error":"InvalidChannel","message":"Invalid channel"}""")
                }
            }))
            VaifClient(VaifConfig(projectId = "project", apiKey = "key", baseUrl = server.url("/").toString())).use { c ->
                try { withTimeout(5000) { c.realtime("notes").changes.first() }; fail<Unit>() }
                catch (e: VaifException) { assertEquals("InvalidChannel", e.code) }
            }
        }
    }

    @Test fun `closing a subscription cancels a waiting collector`() = runBlocking {
        MockWebServer().use { server ->
            val opened = CompletableDeferred<Unit>()
            server.enqueue(MockResponse().withWebSocketUpgrade(object : WebSocketListener() {
                override fun onOpen(webSocket: WebSocket, response: Response) { opened.complete(Unit) }
            }))
            VaifClient(VaifConfig(projectId = "project", apiKey = "key", baseUrl = server.url("/").toString())).use { c ->
                val subscription = c.realtime("notes")
                val job = async { subscription.events.toList() }
                withTimeout(5000) { opened.await() }
                subscription.close()
                withTimeout(5000) { job.await() }
            }
        }
    }
}
