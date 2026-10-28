package studio.vaif

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.*
import java.security.MessageDigest
import java.security.SecureRandom
import okio.ByteString.Companion.toByteString

/**
 * App-user and console authentication with serialized session mutations.
 */
public class Auth internal constructor(private val client: VaifClient) {
    private val mutation = Mutex()
    private val refreshing = Mutex()
    private var inFlight: Deferred<Session>? = null
    private var inFlightGeneration = -1L
    private var generation = 0L
    private var sessionBlocked = false
    private val store get() = client.config.tokenStorage
    private val key get() = client.storageKey
    internal val prefix = client.config.projectId?.let { "/projects/${segment(it)}/auth" } ?: "/auth"
    private fun refreshCookie(token: String): Map<String, String> = mapOf("Cookie" to
        "refresh_token=${java.net.URLEncoder.encode(token, "UTF-8").replace("+", "%20")}")
    private val modeHeaders get() = if (client.config.projectId != null) mapOf("X-Vaif-Refresh-Mode" to "body") else emptyMap()
    /**
     * MFA enrollment, verification and recovery-code operations.
     */
    public val mfa: Mfa = Mfa(this, client)

    private suspend fun readSession(): Session? = if (sessionBlocked) null else
        storageAccess { store.read(key)?.let { vaifJson.decodeFromString<Session>(it) } }

    private suspend fun <T> storageAccess(block: suspend () -> T): T = try { block() }
    catch (e: CancellationException) { throw e }
    catch (e: Exception) { throw VaifException("Session storage failed; clear the store and sign in again", "STORAGE_ERROR") }

    // Delete the previous credential before saving a replacement. A rejected new save must not
    // leave the previous account restorable on restart. A store that cannot delete must throw.
    private suspend fun persist(session: Session?) = withContext(NonCancellable) {
        generation++
        sessionBlocked = true
        storageAccess {
            store.write(key, null)
            if (session != null) {
                try { store.write(key, vaifJson.encodeToString(Session.serializer(), session)) }
                catch (e: Exception) {
                    try { store.write(key, null) } catch (cleanup: Exception) { e.addSuppressed(cleanup) }
                    throw e
                }
            }
        }
        sessionBlocked = false
    }
    /**
     * Reads the current session under the session mutation lock.
     * @return The stored session, or null when absent or blocked after a persistence failure.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun session(): Session? = mutation.withLock { readSession() }
    /**
     * Replaces the session after durably removing the previous credential.
     * @param session Replacement session, or null to remove local credentials.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun setSession(session: Session?): Unit = mutation.withLock {
        if (session != null && session.accessToken.isBlank()) validation("accessToken cannot be empty")
        persist(session)
    }

    /**
     * Creates an app user; console account creation fails locally with CONSOLE_ONLY.
     * @param email App-user email address.
     * @param password Password to authenticate or set.
     * @param name Optional app-user display name.
     * @param metadata Optional app-user metadata JSON.
     * @return The persisted session, pending verification, or MFA challenge.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun signUp(email: String, password: String, name: String? = null, metadata: JsonObject? = null): AuthResult {
        if (client.config.projectId == null) throw VaifConsoleOnlyError("https://console.vaif.studio/register")
        return mutation.withLock { issue("/signup", jsonObject("email" to JsonPrimitive(email), "password" to JsonPrimitive(password),
            "name" to name?.let(::JsonPrimitive), "metadata" to metadata)) }
    }

    /**
     * Authenticates with email and password and persists a successful session.
     * @param email App-user or console email address.
     * @param password Password to authenticate or set.
     * @return The persisted session or an MFA challenge.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun signIn(email: String, password: String): AuthResult = mutation.withLock {
        issue("/login", jsonObject("email" to JsonPrimitive(email), "password" to JsonPrimitive(password)))
    }

    /**
     * Rotates the refresh token. Concurrent callers share a request; a changed session rejects a late result.
     * @return The replacement session after persistence succeeds.
     * @throws VaifException On API, storage or transport failure; SESSION_CHANGED when the session was replaced or
     * removed during the refresh; CLIENT_CLOSED when the client closed first. Cancellation propagates unchanged.
     */
    public suspend fun refresh(): Session {
        val (previous, startedGeneration) = mutation.withLock {
            (readSession() ?: throw VaifException("Sign in before refreshing", "SESSION_REQUIRED")) to generation
        }
        val token = previous.refreshToken ?: throw VaifException("No refresh token is stored", "REFRESH_TOKEN_REQUIRED")
        val deferred = refreshing.withLock {
            // Keep a completed successful result for callers that captured the old generation
            // immediately before its commit, so they cannot redeem that refresh token twice.
            inFlight?.takeIf { inFlightGeneration == startedGeneration && !it.isCancelled } ?: client.scope.async(start = CoroutineStart.LAZY) {
                val result = fetchSession("/refresh", jsonObject("refreshToken" to JsonPrimitive(token)), previous)
                val replacement = (result as? AuthResult.SignedIn)?.session
                    ?: throw VaifException("Refresh returned no session", "INVALID_RESPONSE")
                withContext(NonCancellable) {
                    mutation.withLock {
                        if (generation != startedGeneration || readSession() != previous)
                            throw VaifException("The session changed while refreshing", "SESSION_CHANGED")
                        persist(replacement)
                    }
                }
                replacement
            }.also { inFlightGeneration = startedGeneration; inFlight = it; it.start() }
        }
        val result = try { deferred.await() } catch (e: CancellationException) {
            // The shared request belongs to the client; close() cancels it without cancelling this caller.
            currentCoroutineContext().ensureActive()
            throw VaifException("The client was closed during the refresh", "CLIENT_CLOSED")
        }
        return mutation.withLock {
            if (generation != startedGeneration + 1 || readSession() != result)
                throw VaifException("The session changed while refreshing", "SESSION_CHANGED")
            result
        }
    }

    /**
     * Revokes the refresh credential and clears local credentials and realtime sockets, even on cancellation.
     * @return The API logout response after local cleanup succeeds.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun signOut(): JsonElement = mutation.withLock {
        val previous = readSession()
        generation++
        sessionBlocked = true
        try {
            client.send("POST", "$prefix/logout", body = jsonObject("refreshToken" to previous?.refreshToken?.let(::JsonPrimitive)),
                headers = modeHeaders + (previous?.let { mapOf("Authorization" to "Bearer ${it.accessToken}") } ?: emptyMap()) +
                    (if (client.config.projectId == null && previous?.refreshToken != null) refreshCookie(previous.refreshToken) else emptyMap()), authenticated = false)
        } finally {
            client.disconnectRealtime()
            withContext(NonCancellable) {
                try { persist(null) } finally { storageAccess { store.write("$key:oauth", null) } }
            }
        }
    }

    /**
     * Fetches the current authenticated user.
     * @return User JSON from the API.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun getUser(): JsonObject = client.send("GET", "$prefix/me").asObject()["user"] as? JsonObject
        ?: throw VaifException("User response is missing user", "INVALID_RESPONSE")

    /**
     * Requests an app-user password reset. Console resets fail locally with CONSOLE_ONLY.
     * @param email App-user email address.
     * @param redirectUrl Allowed application callback URL.
     * @return The API acknowledgment.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun requestPasswordReset(email: String, redirectUrl: String? = null): JsonObject {
        if (client.config.projectId == null) throw VaifConsoleOnlyError("https://console.vaif.studio/forgot-password")
        return client.send("POST", "$prefix/forgot-password", body = jsonObject("email" to JsonPrimitive(email),
            "redirectUrl" to redirectUrl?.let(::JsonPrimitive)), authenticated = false).asObject()
    }
    /**
     * Completes an app-user password reset. Console resets fail locally with CONSOLE_ONLY.
     * @param token Password reset credential received by the application.
     * @param password Password to authenticate or set.
     * @return The API acknowledgment.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun confirmPasswordReset(token: String, password: String): JsonObject {
        if (client.config.projectId == null) throw VaifConsoleOnlyError("https://console.vaif.studio/forgot-password")
        return client.send("POST", "$prefix/reset-password", body = jsonObject("token" to JsonPrimitive(token), "password" to JsonPrimitive(password)), authenticated = false).asObject()
    }

    @Serializable private data class PendingOAuth(val state: String, val verifier: String, val createdAt: Long)
    private fun random(bytes: Int): String = ByteArray(bytes).also { SecureRandom().nextBytes(it) }.toByteString().base64Url().trimEnd('=')

    /**
     * Starts S256 PKCE sign-in and stores one pending verifier and state. Open the URL in the system browser.
     * @param provider Configured OAuth provider ID.
     * @param redirectUrl Allowed application callback URL.
     * @return The validated browser handoff URL, state and optional expiry.
     * @throws VaifException On validation, API, storage or transport failure, including STORAGE_ERROR when the
     * token store cannot save, read or remove the pending flow. Cancellation propagates unchanged.
     */
    public suspend fun startOAuth(provider: String, redirectUrl: String): OAuthStart = mutation.withLock {
        requireProject()
        if (redirectUrl.isBlank()) validation("redirectUrl is required")
        val verifier = random(32)
        val state = random(24)
        val challenge = MessageDigest.getInstance("SHA-256").digest(verifier.toByteArray(Charsets.US_ASCII)).toByteString().base64Url().trimEnd('=')
        val raw = client.send("POST", "$prefix/oauth/${segment(provider)}/start", body = jsonObject(
            "redirectUrl" to JsonPrimitive(redirectUrl), "codeChallenge" to JsonPrimitive(challenge),
            "codeChallengeMethod" to JsonPrimitive("S256"), "state" to JsonPrimitive(state)), authenticated = false).asObject()
        val url = raw.string("url") ?: throw VaifException("OAuth response is missing url", "INVALID_RESPONSE")
        safeUrl(url)
        storageAccess { store.write("$key:oauth", vaifJson.encodeToString(PendingOAuth.serializer(), PendingOAuth(state, verifier, System.currentTimeMillis()))) }
        OAuthStart(url, state, raw.optionalPrimitive("expiresIn")?.longOrNull)
    }

    /**
     * Consumes one matching, unexpired OAuth state before exchanging the code.
     * @param code OAuth authorization code returned by the configured provider.
     * @param state State returned by the OAuth callback; must match the pending flow.
     * @return The persisted session or an MFA challenge.
     * @throws VaifException On validation, API, storage or transport failure, including STORAGE_ERROR when the
     * token store cannot save, read or remove the pending flow. Cancellation propagates unchanged.
     */
    public suspend fun handleOAuthCallback(code: String, state: String): AuthResult = mutation.withLock {
        requireProject()
        val pending = storageAccess { store.read("$key:oauth")?.let { vaifJson.decodeFromString<PendingOAuth>(it) } }
        if (pending == null || !MessageDigest.isEqual(pending.state.toByteArray(), state.toByteArray()) ||
            System.currentTimeMillis() - pending.createdAt !in 0..600_000) {
            throw VaifException("No unexpired OAuth flow matches this state; start sign-in again", "OAUTH_STATE_MISMATCH")
        }
        storageAccess { store.write("$key:oauth", null) } // single-use, including failed exchanges
        if (code.isBlank()) validation("OAuth callback code is required")
        issue("/oauth/token", jsonObject("code" to JsonPrimitive(code), "codeVerifier" to JsonPrimitive(pending.verifier)))
    }

    /**
     * Lists configured app-user OAuth providers; requires a project ID.
     * @return The API provider envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun listOAuthProviders(): JsonObject { requireProject(); return client.send("GET", "$prefix/oauth/providers", authenticated = false).asObject() }
    private fun requireProject() { if (client.config.projectId == null) throw VaifException("Configure projectId for app-user OAuth", "PROJECT_ID_REQUIRED") }

    internal suspend fun verifyMfa(challengeToken: String, code: String): AuthResult = mutation.withLock {
        issue("/mfa/verify", jsonObject("challengeToken" to JsonPrimitive(challengeToken), "code" to JsonPrimitive(code)))
    }

    private suspend fun issue(suffix: String, body: JsonObject): AuthResult {
        val result = fetchSession(suffix, body)
        if (result is AuthResult.SignedIn) persist(result.session)
        return result
    }

    private suspend fun fetchSession(suffix: String, body: JsonObject, previous: Session? = null): AuthResult {
        val cookieName = if (client.config.projectId == null) "refresh_token" else "project_refresh_token"
        val cookie = if (client.config.projectId == null && previous?.refreshToken != null)
            refreshCookie(previous.refreshToken) else emptyMap()
        val request = client.request("POST", "$prefix$suffix", body = body.toString().toByteArray(),
            headers = modeHeaders + cookie + mapOf("Content-Type" to "application/json"), authenticated = false)
        val response = checkResponse(client.execute(request))
        val raw = decodeJson(response).asObject()
        if (raw.optionalPrimitive("mfaRequired")?.booleanOrNull == true) {
            return AuthResult.MfaRequired(raw.string("challengeToken") ?: throw VaifException("Missing MFA challenge", "INVALID_RESPONSE"))
        }
        if (suffix == "/signup" && raw.optionalPrimitive("pendingVerification")?.booleanOrNull == true) {
            return AuthResult.PendingVerification(raw.string("message"))
        }
        val access = raw.optionalPrimitive("accessToken")?.contentOrNull ?: raw.optionalPrimitive("token")?.contentOrNull ?: throw VaifException("Token response is missing accessToken", "INVALID_RESPONSE")
        if (access.isBlank()) throw VaifException("Token response has an empty accessToken", "INVALID_RESPONSE")
        val cookieToken = response.headers.entries.firstOrNull { it.key.equals("set-cookie", true) }?.value
            ?.let { Regex("(?:^|,\\s*)${cookieName}=([^; ,]+)").find(it)?.groupValues?.get(1) }
        val session = Session(access, raw.string("refreshToken") ?: cookieToken ?: previous?.refreshToken,
            (raw["user"] as? JsonObject) ?: previous?.user, raw.optionalPrimitive("expiresIn")?.longOrNull, raw.optionalPrimitive("expiresAt")?.contentOrNull)
        return AuthResult.SignedIn(session)
    }
}

/**
 * Multi-factor enrollment, verification and recovery-code operations.
 */
public class Mfa internal constructor(private val auth: Auth, private val client: VaifClient) {
    /**
     * Starts MFA enrollment for the signed-in user.
     * @return Enrollment details, including the enrollment token and setup information.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun enrollStart(): JsonObject = client.send("POST", "${auth.prefix}/mfa/enroll-start").asObject()
    /**
     * Confirms enrollment with a second-factor code.
     * @param enrollToken Secret token returned by enrollment start.
     * @param code Current second-factor code for the new enrollment.
     * @return The API enrollment confirmation and recovery codes, when supplied.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun enrollConfirm(enrollToken: String, code: String): JsonObject = client.send("POST", "${auth.prefix}/mfa/enroll-confirm",
        body = jsonObject("enrollToken" to JsonPrimitive(enrollToken), "code" to JsonPrimitive(code))).asObject()
    /**
     * Verifies a sign-in challenge and persists credentials only after success.
     * @param challengeToken Secret token returned by an MFA-required sign-in.
     * @param code Second-factor or recovery code accepted by the API.
     * @return The authentication outcome.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun verify(challengeToken: String, code: String): AuthResult = auth.verifyMfa(challengeToken, code)
    /**
     * Disables MFA after verifying the current second factor.
     * @param code Second-factor or recovery code accepted by the API.
     * @return The API acknowledgment.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun disable(code: String): JsonObject = client.send("POST", "${auth.prefix}/mfa/disable", body = jsonObject("code" to JsonPrimitive(code))).asObject()
    /**
     * Replaces recovery codes after verifying the current second factor.
     * @param code Second-factor or recovery code accepted by the API.
     * @return The API envelope with replacement recovery codes.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun regenerateCodes(code: String): JsonObject = client.send("POST", "${auth.prefix}/mfa/regenerate-codes", body = jsonObject("code" to JsonPrimitive(code))).asObject()
}
