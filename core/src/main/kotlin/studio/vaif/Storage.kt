package studio.vaif

import kotlinx.serialization.json.*

/**
 * File signing and transfers with HTTPS targets and no credentials sent to file hosts.
 */
public class Storage internal constructor(private val client: VaifClient) {
    private fun validateSize(sizeBytes: Long) { if (sizeBytes !in 1..5_368_709_120L) validation("sizeBytes must be between 1 byte and 5 GiB") }
    /**
     * Requests a validated upload URL for an exact, positive byte size of at most 5 GiB.
     * @param key Object key within the selected bucket.
     * @param sizeBytes Exact positive content size in bytes, at most 5 GiB.
     * @param contentType MIME type of the uploaded content.
     * @param bucket Bucket ID or name; defaults to the configured bucket.
     * @return The API signing envelope with a validated URL.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun getUploadUrl(key: String, sizeBytes: Long, contentType: String = "application/octet-stream", bucket: String = client.config.defaultBucket): JsonObject {
        validateSize(sizeBytes)
        return client.send("POST", "/storage/upload-url", body = jsonObject("key" to JsonPrimitive(key), "bucket" to JsonPrimitive(bucket),
            "sizeBytes" to JsonPrimitive(sizeBytes), "contentType" to JsonPrimitive(contentType))).asObject().also { signedUrl(it) }
    }
    /**
     * Requests a download URL and validates its scheme before returning it.
     * @param key Object key within the selected bucket.
     * @param bucket Bucket ID or name; defaults to the configured bucket.
     * @param expiresIn Positive URL lifetime in seconds.
     * @return The API signing envelope with a validated URL.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun getDownloadUrl(key: String, bucket: String = client.config.defaultBucket, expiresIn: Int = 3600): JsonObject {
        if (expiresIn < 1) validation("expiresIn must be positive")
        return client.send("POST", "/storage/download-url", body = jsonObject("key" to JsonPrimitive(key), "bucket" to JsonPrimitive(bucket),
            "expiresIn" to JsonPrimitive(expiresIn))).asObject().also { signedUrl(it) }
    }
    /**
     * Creates a signed download URL without transferring content.
     * @param key Object key within the selected bucket.
     * @param expiresIn Positive URL lifetime in seconds.
     * @param bucket Bucket ID or name; defaults to the configured bucket.
     * @return The validated signed URL.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun createSignedUrl(key: String, expiresIn: Int = 3600, bucket: String = client.config.defaultBucket): String = signedUrl(getDownloadUrl(key, bucket, expiresIn))
    private fun signedUrl(response: JsonObject): String = response.string("url")?.also { safeUrl(it) }
        ?: throw VaifException("Storage response is missing url", "INVALID_RESPONSE")

    /**
     * Uploads a bounded byte array using one PUT; the signed host receives no SDK credentials.
     * @param key Object key within the selected bucket.
     * @param bytes Complete file content to upload.
     * @param sizeBytes Exact positive content size in bytes, at most 5 GiB.
     * @param contentType MIME type of the uploaded content.
     * @param bucket Bucket ID or name; defaults to the configured bucket.
     * @return A summary containing the key, bucket, size and content type.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun upload(key: String, bytes: ByteArray, sizeBytes: Long, contentType: String = "application/octet-stream", bucket: String = client.config.defaultBucket): JsonObject {
        validateSize(sizeBytes)
        if (bytes.size.toLong() != sizeBytes) validation("sizeBytes must equal the uploaded byte count")
        val signed = getUploadUrl(key, sizeBytes, contentType, bucket)
        // Direct requests deliberately do not use client.request: no project key or bearer token at the file host.
        transfer(HttpRequest("PUT", safeUrl(signedUrl(signed)), mapOf("Content-Type" to contentType), bytes))
        return jsonObject("ok" to JsonPrimitive(true), "key" to JsonPrimitive(key), "bucket" to JsonPrimitive(bucket),
            "size" to JsonPrimitive(sizeBytes), "contentType" to JsonPrimitive(contentType))
    }
    /**
     * Downloads bytes from a validated signed URL without forwarding SDK credentials.
     * @param key Object key within the selected bucket.
     * @param bucket Bucket ID or name; defaults to the configured bucket.
     * @return The complete buffered file content.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun download(key: String, bucket: String = client.config.defaultBucket): ByteArray =
        transfer(HttpRequest("GET", safeUrl(createSignedUrl(key, bucket = bucket)))).body

    // A file host's error body can echo the signed URL; only the status reaches the exception.
    private suspend fun transfer(request: HttpRequest): HttpResponse = client.execute(request).also {
        if (it.status !in 200..299) throw VaifException("The storage transfer failed (HTTP ${it.status})", "STORAGE_TRANSFER_FAILED", it.status)
    }

    private suspend fun bucketId(bucket: String): String {
        if (Regex("[0-9a-fA-F]{8}(-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}").matches(bucket)) return bucket
        val project = client.config.projectId ?: throw VaifException("Configure projectId to resolve bucket names", "PROJECT_ID_REQUIRED")
        val buckets = when (val value = client.send("GET", "/storage/buckets", listOf("projectId" to project)).asObject()["buckets"]) {
            null, JsonNull -> emptyList()
            is JsonArray -> value.map { it.asObject() }
            else -> invalidResponse()
        }
        return buckets.firstOrNull { it.string("name") == bucket }?.string("id")
            ?: throw VaifException("Bucket was not found in this project", "BUCKET_RESOLUTION_FAILED")
    }
    /**
     * Lists files in a project bucket; name lookup may require console privileges.
     * @param bucket Bucket ID or name; defaults to the configured bucket.
     * @param prefix Optional object-key prefix.
     * @param limit Optional page size between 1 and 1000.
     * @param cursor Opaque continuation token from the previous page.
     * @return The API envelope with files, folders and continuation metadata.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun list(bucket: String = client.config.defaultBucket, prefix: String? = null, limit: Int? = null, cursor: String? = null): JsonObject {
        if (limit != null && limit !in 1..1000) validation("limit must be 1..1000")
        return client.send("GET", "/buckets/${segment(bucketId(bucket))}/files", buildList {
            prefix?.let { add("prefix" to it) }; limit?.let { add("maxKeys" to it.toString()) }; cursor?.let { add("continuationToken" to it) }
        }).asObject()
    }
    /**
     * Deletes an object from a project bucket.
     * @param key Object key within the selected bucket.
     * @param bucket Bucket ID or name; defaults to the configured bucket.
     * @return The API deletion acknowledgment.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun delete(key: String, bucket: String = client.config.defaultBucket): JsonObject =
        client.send("DELETE", "/buckets/${segment(bucketId(bucket))}/files", listOf("key" to key)).asObject()
}
