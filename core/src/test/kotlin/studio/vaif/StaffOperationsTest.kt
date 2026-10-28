package studio.vaif

import studio.vaif.generated.OperationTable
import studio.vaif.generated.Operations
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Modifier
import kotlin.coroutines.intrinsics.suspendCoroutineUninterceptedOrReturn
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.JsonObject
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StaffOperationsTest {
    private fun staff(path: String) = Regex("^/(admin|auth/impersonate)(/|$)").containsMatchIn(path)

    @Test fun `no public generated method calls platform staff routes`() = runBlocking {
        val observed = mutableListOf<HttpRequest>()
        val transport = object : Transport {
            override suspend fun execute(request: HttpRequest): HttpResponse {
                observed.add(request)
                return HttpResponse(200, emptyMap(), "{}".toByteArray())
            }
            override suspend fun stream(request: HttpRequest): Response {
                observed.add(request)
                return Response.Builder().request(Request.Builder().url(request.url).build())
                    .protocol(Protocol.HTTP_1_1).code(200).message("OK")
                    .body("{}".toResponseBody("text/event-stream".toMediaType())).build()
            }
        }
        val methods = Operations::class.java.declaredMethods.filter {
            Modifier.isPublic(it.modifiers) && !Modifier.isStatic(it.modifiers) && !it.isSynthetic
        }
        assertEquals(OperationTable.operations.keys, methods.map { it.name }.toSet())
        assertTrue(OperationTable.ungeneratedOperations.any { staff(it.second) })
        for ((_, path, reason) in OperationTable.ungeneratedOperations) {
            if (staff(path)) assertEquals("platform staff only", reason)
            if (reason.startsWith("retired")) assertEquals("retired; the API answers 410", reason)
        }
        VaifClient(VaifConfig(projectId = "project"), transport).use { client ->
            for (method in methods) {
                val operation = OperationTable.operations.getValue(method.name)
                assertFalse(staff(operation.path), method.name)
                val args = mutableListOf<Any?>()
                if (operation.pathParams.isNotEmpty()) args.add(operation.pathParams.associateWith { "value" })
                if (operation.bodyKind != null) args.add(when (operation.bodyKind) {
                    "binary" -> byteArrayOf(1)
                    "text" -> "body"
                    else -> JsonObject(emptyMap())
                })
                if (operation.queryParams.isNotEmpty()) args.add(JsonObject(emptyMap()))
                args.add(emptyMap<String, String>())
                val previousCount = observed.size
                try {
                    val result = suspendCoroutineUninterceptedOrReturn<Any?> { continuation ->
                        try { method.invoke(client.operations, *(args + continuation).toTypedArray()) }
                        catch (e: InvocationTargetException) { throw e.targetException }
                    }
                    (result as? Response)?.close()
                    assertEquals(previousCount + 1, observed.size, method.name)
                } catch (e: VaifConsoleOnlyError) {
                    assertTrue(operation.path in setOf("/auth/signup", "/auth/forgot-password", "/auth/reset-password"))
                    assertEquals(previousCount, observed.size)
                }
            }
        }
        assertTrue(observed.isNotEmpty())
        assertTrue(observed.none { staff(it.url.encodedPath) })
    }

    @Test fun `operations tagged admin outside the admin paths have no generated method`() {
        val methods = Operations::class.java.declaredMethods.map { it.name }.toSet()
        for (name in listOf("postFlags", "getFlags", "putFlagsByKey", "deleteFlagsByKey", "postEnterpriseInvoicesByInvoiceIdPaid",
            "postEnterpriseInvoicesByInvoiceIdSend", "postEnterpriseContracts", "postEnterpriseContractsByContractIdInvoice",
            "getAiCopilotStats", "postDocsChangelog", "deleteDocsV2PagesById")) {
            assertFalse(name in methods, name)
            assertFalse(OperationTable.operations.containsKey(name), name)
        }
        for (route in listOf("POST" to "/flags", "GET" to "/flags", "PUT" to "/flags/{key}", "DELETE" to "/flags/{key}",
            "POST" to "/enterprise/invoices/{invoiceId}/paid", "POST" to "/enterprise/contracts", "GET" to "/ai/copilot/stats",
            "POST" to "/docs/changelog")) {
            assertTrue(Triple(route.first, route.second, "platform staff only") in OperationTable.ungeneratedOperations, route.toString())
        }
        assertEquals(775, OperationTable.operations.size)
        assertEquals(168, OperationTable.ungeneratedOperations.size)
        assertEquals(134, OperationTable.ungeneratedOperations.count { it.third == "platform staff only" })
        assertEquals(listOf("getEnterprisePricing", "postEnterpriseInquire"),
            OperationTable.operations.keys.filter { it == "getEnterprisePricing" || it == "postEnterpriseInquire" }.sorted())
    }
}
