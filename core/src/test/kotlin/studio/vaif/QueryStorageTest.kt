package studio.vaif

import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class QueryStorageTest {
    @Test fun `bulk writes and count reject fields the server drops or treats as operators`() = runBlocking {
        val fake = FakeTransport()
        fakeClient(fake).use { c ->
            for (field in listOf("owner-id", "status.neq", "data->owner", "", "x[y]")) {
                val query = c.from("notes").eq("status", "draft").eq(field, "u")
                for (call in listOf<suspend () -> Unit>({ query.update(obj("""{"body":"changed"}""")) }, { query.delete() }, { query.count() })) {
                    try { call(); fail<Unit>("Invalid field must not reach the API") }
                    catch (e: VaifException) { assertEquals("VALIDATION_ERROR", e.code) }
                }
            }
            for (operator in listOf("nin", "between", "is_null", "is_not_null")) {
                try { c.from("notes").filter("status", operator, "draft"); fail<Unit>() }
                catch (e: VaifException) { assertEquals("VALIDATION_ERROR", e.code) }
            }
            assertTrue(fake.requests.isEmpty())
        }
    }
    @Test fun `bulk requests preserve all equalities and count reads aggregate values`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { req -> if (req.url.encodedPath.endsWith("aggregate")) jsonResponse("""{"data":[{"value":2}]}""") else jsonResponse("{}") }
        fakeClient(fake).use { c ->
            val query = c.from("notes").eq("status", "draft").eq("owner_id", "a b")
            query.update(obj("""{"body":"saved"}"""))
            assertEquals(obj("""{"data":{"body":"saved"},"filter":{"status":"draft","owner_id":"a b"}}"""), obj(String(fake.requests.last().body!!)))
            query.delete()
            assertEquals("a b", fake.requests.last().url.queryParameter("filter[owner_id]"))
            assertEquals("draft", fake.requests.last().url.queryParameter("filter[status]"))
            assertEquals(2L, query.count())
            assertEquals("count", fake.requests.last().url.queryParameter("fn"))
            fake.handler = { jsonResponse("""{"data":[]}""") }
            assertEquals(0L, query.count())
        }
    }
    @Test fun `row operations preserve API data envelopes`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { jsonResponse("""{"data":{"id":"row-1","body":"saved"}}""") }
        fakeClient(fake).use { c ->
            val result = c.from("notes").insert(obj("""{"body":"saved"}"""))
            assertEquals("row-1", result.getValue("data").jsonObject.string("id"))
        }
    }
    @Test fun `storage resolves names and uses actual list delete and function routes`() = runBlocking {
        val fake = FakeTransport()
        fake.handler = { req -> if (req.url.encodedPath == "/storage/buckets") jsonResponse("""{"buckets":[{"name":"default","id":"00000000-0000-0000-0000-000000000001"}]}""") else jsonResponse("{}") }
        fakeClient(fake).use { c ->
            c.storage.list(prefix = "a/b", limit = 20, cursor = "next")
            val list = fake.requests.last().url
            assertEquals("/buckets/00000000-0000-0000-0000-000000000001/files", list.encodedPath)
            assertEquals("a/b", list.queryParameter("prefix"))
            assertEquals("20", list.queryParameter("maxKeys"))
            assertEquals("next", list.queryParameter("continuationToken"))
            c.storage.delete("a/b ?#")
            assertEquals("a/b ?#", fake.requests.last().url.queryParameter("key"))
            c.functions.invoke("hello/world", obj("""{"body":"value"}"""), includeLogs = true)
            assertEquals("/functions/hello%2Fworld/invoke", fake.requests.last().url.encodedPath)
            assertEquals("true", fake.requests.last().url.queryParameter("includeLogs"))
            assertEquals(obj("""{"body":"value"}"""), obj(String(fake.requests.last().body!!)))
        }
    }
}
