package studio.vaif

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.*
import java.util.concurrent.ConcurrentHashMap

/** Stores credentials for one application installation. Server tenants need separate storage scopes. */
public interface TokenStorage {
    /**
     * Reads a stored credential.
     * @param key Opaque, origin- and project-scoped storage key.
     * @return The stored value, or null when absent.
     * @throws Exception When storage cannot be read; failures must not appear as missing entries.
     */
    public suspend fun read(key: String): String?
    /**
     * Atomically persists or durably deletes a credential.
     * @param key Opaque storage key.
     * @param value Value to persist, or null to remove it.
     * @throws Exception When persistence or deletion fails.
     */
    public suspend fun write(key: String, value: String?): Unit
}

/** Thread-safe process memory storage. Values disappear when this instance is discarded. */
public class MemoryTokenStorage : TokenStorage {
    private val values = ConcurrentHashMap<String, String>()
    /** Reads [key], returning null if absent. No persistence or I/O is performed. */
    public override suspend fun read(key: String): String? = values[key]
    /** Stores [value] under [key], or removes [key] when [value] is null. */
    public override suspend fun write(key: String, value: String?): Unit {
        if (value == null) values.remove(key) else values[key] = value
    }
}

/**
 * An app-user or console session. Treat all token fields as secrets.
 * @property accessToken Bearer credential for API calls.
 * @property refreshToken Rotating refresh credential, if supplied by the API.
 * @property user User JSON returned by authentication, if present.
 * @property expiresIn Access token lifetime in seconds, if present.
 * @property expiresAt API-provided expiry timestamp, if present.
 */
@Serializable
public data class Session(
    public val accessToken: String,
    public val refreshToken: String? = null,
    public val user: JsonObject? = null,
    public val expiresIn: Long? = null,
    public val expiresAt: String? = null,
) {
    /** Returns a diagnostic string with both tokens redacted. */
    public override fun toString(): String = "Session(accessToken=[redacted], refreshToken=[redacted])"
}

/** Authentication outcome; challenges and pending verification do not replace an existing session. */
public sealed interface AuthResult {
    /**
     * A successfully persisted session.
     * @property session The authenticated user's session.
     */
    public data class SignedIn(public val session: Session) : AuthResult
    /**
     * Email verification is required.
     * @property message Optional API instructions.
     */
    public data class PendingVerification(public val message: String?) : AuthResult
    /**
     * A second factor is required.
     * @property challengeToken Secret single-purpose MFA challenge.
     */
    public class MfaRequired(public val challengeToken: String) : AuthResult {
        /** Returns a diagnostic string with the challenge redacted. */
        public override fun toString(): String = "MfaRequired(challengeToken=[redacted])"
    }
}

/**
 * Browser handoff for one pending OAuth flow.
 * @property url HTTPS authorization URL to open in the system browser; loopback HTTP is allowed in tests.
 * @property state Random state that the callback must return unchanged.
 * @property expiresIn API-provided lifetime in seconds, if present.
 */
public class OAuthStart(public val url: String, public val state: String, public val expiresIn: Long?) {
    /** Returns a diagnostic string without the authorization URL or state. */
    public override fun toString(): String = "OAuthStart([redacted])"
}

/**
 * SDK validation, storage, transport or API failure. Coroutine cancellation propagates separately.
 * @param message Human-readable description; API messages may contain application data.
 * @property code Stable API or SDK error code.
 * @property status HTTP status, or realtime close code when applicable.
 * @property requestId API request identifier for support, if available.
 * @property details Structured API error details, if available.
 */
public open class VaifException(
    message: String,
    public val code: String = "UNKNOWN",
    public val status: Int? = null,
    public val requestId: String? = null,
    public val details: JsonElement? = null,
) : RuntimeException(message)

/**
 * A console account operation that must be completed in the console, before any network call.
 * @property consoleUrl Console page for completing the operation when the console becomes available.
 */
public class VaifConsoleOnlyError(public val consoleUrl: String) : VaifException(
    "Manage your VAIF Studio account in the console at $consoleUrl. For your app's users, configure projectId.",
    code = "CONSOLE_ONLY",
)

internal val vaifJson = Json { ignoreUnknownKeys = true; encodeDefaults = false }
internal fun validation(message: String): Nothing = throw VaifException(message, "VALIDATION_ERROR")
internal fun JsonObject.string(key: String): String? = (this[key] as? JsonPrimitive)?.contentOrNull
internal fun invalidResponse(): Nothing = throw VaifException("API returned an unexpected response shape", "INVALID_RESPONSE")
internal fun JsonElement.asObject(): JsonObject = this as? JsonObject ?: invalidResponse()
// Absent or null fields read as null; a field of the wrong JSON kind is an invalid response.
internal fun JsonObject.optionalPrimitive(key: String): JsonPrimitive? = when (val value = this[key]) {
    null, JsonNull -> null
    is JsonPrimitive -> value
    else -> invalidResponse()
}
internal fun jsonObject(vararg entries: Pair<String, JsonElement?>) = JsonObject(entries.filter { it.second != null }.associate { it.first to it.second!! })
internal fun jsonValue(value: Any?): JsonElement = when (value) {
    null -> JsonNull
    is JsonElement -> value
    is String -> JsonPrimitive(value)
    is Number -> JsonPrimitive(value)
    is Boolean -> JsonPrimitive(value)
    is Iterable<*> -> JsonArray(value.map(::jsonValue))
    else -> validation("Use a JSON value, string, number, boolean or list")
}
