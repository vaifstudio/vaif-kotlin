# VAIF Kotlin SDK

<!-- BEGIN GENERATED SDK STATUS: notice:kotlin -->
> `studio.vaif:vaif-kotlin` 1.0.0 is the version in this repository, has not been tagged yet and is not on Maven Central yet. The hosted API (`https://api.vaif.studio`) and console are not available yet.
<!-- END GENERATED SDK STATUS: notice:kotlin -->

The Kotlin client for VAIF Studio app-user authentication, data, storage,
functions and realtime. Source: [vaifstudio/vaif-kotlin](https://github.com/vaifstudio/vaif-kotlin).
Examples describe the intended API contract and require a configured API
instance to run.

## Requirements

- Kotlin 2.1.21 or later for consumers; Java 8 or later at runtime.
- Android API 23 or later for Android applications, with INTERNET permission.
- JDK 17 to build the SDK from source using its Gradle wrapper.

The SDK compiles with Kotlin language and API level 2.0 to Java 8 bytecode. Its
coroutine, serialization and standard library dependencies set the Kotlin 2.1.21
consumer minimum.

The core and Android storage artifacts are JARs. Your Android app must set its own
minSdk to at least 23. The core builds without an Android SDK. The Android adapter
builds and runs its unit tests in GitHub CI against the runner's preinstalled
Android API 35. The encryption and serialization code it uses is in core and is
covered by JVM tests. Device Keystore and D8 validation remain release checks.

The SDK uses suspend functions, coroutine Flow, kotlinx.serialization JSON values,
and OkHttp. OkHttp supplies cancellable HTTP and WebSocket connections through the
same client configuration, avoiding a second transport dependency.

## Installation

The `studio.vaif:vaif-kotlin` and `studio.vaif:vaif-kotlin-android` artifacts are
not published to Maven Central yet. Once they are, add Maven Central and the core
dependency to your application's Gradle configuration.

```kotlin
// build.gradle.kts
repositories { mavenCentral() }
dependencies {
    implementation("studio.vaif:vaif-kotlin:1.0.0")
    // Optional Android encrypted session storage:
    implementation("studio.vaif:vaif-kotlin-android:1.0.0")
}
```

Until then, clone and build the source, or include this repository as a Gradle
composite build with substitutions for `:core` and `:android`.

```sh
git clone https://github.com/vaifstudio/vaif-kotlin.git
cd vaif-kotlin
./gradlew :core:build :core:conformance --no-daemon
```

## Quick start

Use your project's publishable API key in Android applications. Keep service keys
on your server. Call suspend functions from a coroutine and close the client when
its owning application component is disposed.

```kotlin
import studio.vaif.VaifClient
import studio.vaif.VaifConfig
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    VaifClient(VaifConfig(
        projectId = "your-project-id",
        apiKey = "your-publishable-key",
    )).use { client ->
        val rows = client.from("notes").select("id", "body").limit(20).list()
        println(rows["data"])
    }
}
```

## Auth

App users are scoped to `projectId`. Sign-up, sign-in and MFA verification return
an `AuthResult`: `SignedIn`, `PendingVerification`, or `MfaRequired`.

```kotlin
import studio.vaif.AuthResult
import studio.vaif.VaifClient

suspend fun signIn(client: VaifClient, email: String, password: String) {
    when (val result = client.auth.signIn(email, password)) {
        is AuthResult.SignedIn -> println(result.session.user?.get("id"))
        is AuthResult.PendingVerification -> println(result.message)
        is AuthResult.MfaRequired -> {
            // Collect a TOTP or backup code, then call:
            // client.auth.mfa.verify(result.challengeToken, userEnteredCode)
            println("MFA verification required")
        }
    }
}

suspend fun accountActions(client: VaifClient, email: String, password: String) {
    client.auth.signUp(email, password)
    client.auth.getUser()
    client.auth.refresh()
    client.auth.requestPasswordReset(email, "myapp://reset")
    client.auth.signOut()
}
```

`confirmPasswordReset(token, password)` completes a reset. `auth.mfa` also exposes
`enrollStart()`, `enrollConfirm(enrollToken, code)`, `disable(code)`, and
`regenerateCodes(code)`. MFA challenges and pending-verification results leave the
current session unchanged. Console account sign-up and password reset throw
`VaifConsoleOnlyError` with code `CONSOLE_ONLY` and a console URL before any request,
including when called through generated operations.

Tokens use `TokenStorage`, whose suspend `read(key)` and `write(key, value)` methods
must report failures. `write(key, null)` must durably delete an entry. The default
`MemoryTokenStorage` does not persist tokens. Session and pending OAuth keys include
both the canonical API URL and project ID. Use one client per storage scope; the
SDK does not coordinate refreshes across clients or processes.

`session()` reads the session; `setSession(Session?)` replaces it. Concurrent
refreshes share a request. A refresh finishing after sign-out or replacement fails
with `SESSION_CHANGED` and cannot restore credentials. Replacement removes the old
stored credential before saving the new one. Storage failures throw `STORAGE_ERROR`
and block the local session. If the store refuses deletion, resolve that failure
before restarting the application; no SDK can guarantee removal from an unwritable
store. Sign-out attempts server revocation with the refresh credential even if the
access token expired, then clears local credentials in a cancellation-safe cleanup.
Remote revocation failures and local deletion failures propagate to the caller.

Refresh is explicit. There is no background refresh or automatic retry on HTTP 401,
including a function's own 401. Refresh before expiry, or handle an API auth-layer
error explicitly. Do not blindly replay mutating requests.

### OAuth with PKCE

```kotlin
import studio.vaif.AuthResult
import studio.vaif.OAuthStart
import studio.vaif.VaifClient

suspend fun beginOAuth(client: VaifClient): OAuthStart =
    client.auth.startOAuth("google", "myapp://oauth/callback")

suspend fun completeOAuth(client: VaifClient, code: String, state: String): AuthResult =
    client.auth.handleOAuthCallback(code, state)
```

Open the returned URL in the system browser. Configure allowed redirect URLs and
Android intent filters or app links in your application. The SDK generates an S256
challenge, stores the verifier and random state, validates state and a ten-minute
expiry, and consumes the flow once before exchange. One pending flow is kept per
storage scope. Complete an MFA challenge through `auth.mfa.verify` if returned.
Browser navigation and cancellation UI belong to your application.

### Android persistence

```kotlin
// Android example
import android.content.Context
import studio.vaif.VaifClient
import studio.vaif.VaifConfig
import studio.vaif.android.AndroidKeystoreTokenStorage

fun androidClient(context: Context): VaifClient = VaifClient(VaifConfig(
    projectId = "your-project-id",
    apiKey = "your-publishable-key",
    tokenStorage = AndroidKeystoreTokenStorage(context),
))
```

The Android adapter encrypts private SharedPreferences entries with AES-256-GCM
using an Android Keystore key, binding each ciphertext to its storage key. Hardware
backing depends on the device. It supports a single app process. Corruption,
key invalidation and commit failures throw; there is no plaintext fallback.

Exclude `vaif_tokens.xml`, or your custom store name, from both Android backup and
Android 12+ device transfer using your app's backup rules. Restored ciphertext
cannot be decrypted with a different installation's key. Device persistence,
backup and key-invalidation checks remain open for the first release.

## Data

```kotlin
import studio.vaif.VaifClient
import kotlinx.serialization.json.*

suspend fun editNotes(client: VaifClient, userId: String) {
    val rows = client.from("notes").select("id", "body").eq("owner_id", userId)
        .order("created_at", ascending = false).range(0, 19).list()
    println(rows["data"])
    val inserted = client.from("notes").insert(buildJsonObject { put("body", "Hello") })
    val id = inserted.getValue("data").jsonObject.getValue("id").jsonPrimitive.content
    client.from("notes").update(id, buildJsonObject { put("body", "Updated") })
    client.from("notes").upsert(buildJsonObject {
        put("id", id)
        put("body", "Saved")
    }, conflictColumns = listOf("id"))
    client.from("notes").delete(id)
    val count = client.from("notes").eq("owner_id", userId).count()
    println(count)
}
```

Queries are immutable. Filters include `eq`, `neq`, `gt`, `gte`, `lt`, `lte`, `like`,
`ilike`, `inList` and `where(JsonObject)` for API AND/OR trees. `range` is inclusive;
`limit` sets a positive maximum. List results retain the API `data` and `count`
fields; mutations retain the API response envelope. Bulk insert accepts a list of
JSON objects. Bulk `update(values)`, `delete()` and aggregate `count()` support
AND equality filters with plain column names. Unsupported filters or query modifiers
fail locally; bulk mutations require a nonempty filter. Use row IDs for other writes.

## Storage

```kotlin
import studio.vaif.VaifClient

suspend fun storeFile(client: VaifClient) {
    val bytes = "Hello".toByteArray(Charsets.UTF_8)
    client.storage.upload("hello.txt", bytes, sizeBytes = bytes.size.toLong(), contentType = "text/plain")
    val downloaded = client.storage.download("hello.txt")
    println(downloaded.size)
    client.storage.list(prefix = "", limit = 100)
    client.storage.createSignedUrl("hello.txt", expiresIn = 300)
    client.storage.delete("hello.txt")
}
```

Uploads require the exact positive byte size and use a single buffered PUT.
`getUploadUrl(key, sizeBytes, contentType, bucket)` supports a caller-managed transfer
with a known length. The API maximum is 5 GiB; byte-array uploads are also bounded
by JVM array size and available memory. Multipart coordination and progress callbacks
are outside this version's high-level API.

`getDownloadUrl` and `createSignedUrl` return signed download targets. Upload and
download targets require HTTPS, allowing HTTP only for `localhost`, `127.0.0.1`,
and `::1`. Signed transfers receive no SDK credentials. Redirects are disabled.
A failed transfer throws `STORAGE_TRANSFER_FAILED` with the HTTP status only; the
file host's response body is not copied into the error, so signed query parameters
cannot appear in its message.
Storage lists retain `files`, `folders`, `nextToken` and `isTruncated` when returned.
Bucket UUIDs avoid name lookup; name resolution uses `/storage/buckets`, which can
require console privileges on the API. Set `defaultBucket` or pass a bucket to each call.

## Functions

```kotlin
import studio.vaif.VaifClient
import kotlinx.serialization.json.*

suspend fun invokeFunction(client: VaifClient): JsonObject =
    client.functions.invoke("hello_world", buildJsonObject { put("body", "Hello") }, includeLogs = true)
```

Invocation accepts a function ID or name and returns the API envelope, including
`data`, logs, timing and status when present. Requests are never automatically replayed.

## Realtime

```kotlin
import studio.vaif.RealtimeFilter
import studio.vaif.VaifClient
import kotlinx.coroutines.flow.collect

suspend fun observeNotes(client: VaifClient, userId: String) {
    val subscription = client.realtime("notes", listOf(RealtimeFilter("owner_id", "eq", userId)))
    try {
        subscription.changes.collect { event -> println(event["op"]) }
    } finally {
        subscription.close()
    }
}
```

Each collection opens a WebSocket at `/realtime/ws`: HTTPS maps to WSS; loopback
HTTP maps to WS. Invalid schemes and remote HTTP fail locally. Credentials travel
in the initial auth frame. The client waits for `welcome`, subscribes, checks the
channel acknowledgement, and delivers `db_change` events. `events` also includes
subscription and auth-refresh acknowledgements. OkHttp sends protocol pings.

Failures, invalid frames, close, timeout and consumer overflow terminate the Flow
with `VaifException`. Cancellation closes its socket. Choose retry/backoff in your
application; no reconnect happens automatically. After a session refresh, call
`subscription.refreshAuth()` to update active sockets. `close()` permanently stops
that subscription. Presence and broadcast helpers are outside this version's core.

## Error handling

```kotlin
import studio.vaif.VaifClient
import studio.vaif.VaifException

suspend fun readNotes(client: VaifClient) {
    try {
        client.from("notes").limit(20).list()
    } catch (error: VaifException) {
        println("code=${error.code} status=${error.status} requestId=${error.requestId}")
    }
}
```

API errors preserve code, HTTP status, request ID and details when present.
Transport connection and event-stream read failures use `NETWORK_ERROR`; realtime
failures use SDK error codes. A response body that is not the documented JSON shape
throws `INVALID_RESPONSE`, and token store failures throw `STORAGE_ERROR`. Closing
the client while a refresh is in flight makes waiting callers throw `CLIENT_CLOSED`.
Coroutine cancellation is preserved. Custom transports
must report network failures as `IOException` or `VaifException`. No request is
retried automatically, and redirects are surfaced to callers.

### Generated operations

`client.operations` exposes spec-derived suspend methods for non-staff operations. JSON operations accept
and return `JsonElement`; schema-specific DTOs are not generated. Paths are encoded
per segment, queries support deep-object keys and repeated arrays, binary results
are `ByteArray`, and event streams return an unbuffered OkHttp `Response` you must
close. Read failures are wrapped as SDK errors. Generated token operations return
raw JSON; use `auth` for session persistence and PKCE.

```kotlin
import studio.vaif.VaifClient
import kotlinx.serialization.json.JsonElement

suspend fun listApiKeys(client: VaifClient, projectId: String): JsonElement =
    client.operations.getProjectsByProjectIdApiKeys(path = mapOf("projectId" to projectId))
```

`client.operations` has 775 methods generated from the API contract.
`OperationTable.ungeneratedOperations` lists the 168 other operations and the reason
each has no method. 134 of them read "platform staff only": the API answers them
only for VAIF platform staff. They are every operation under `/admin/*` and
`/auth/impersonate/*`, and the staff operations outside those paths: feature flags
(`/flags`), enterprise contract and invoice writes, Verament usage statistics
(`GET /ai/copilot/stats`) and documentation content writes under `/docs`. The other
34 have no typed JSON success response in the contract. A retired route that is not
staff-only would read "retired; the API answers 410". Generated methods still
require server authorization.

## Configuration

`VaifConfig` accepts `projectId`, `apiKey`, `baseUrl`, `tokenStorage` and
`defaultBucket`. The default API URL is `https://api.vaif.studio`. HTTP is permitted
only on loopback hosts, and URL credentials are rejected. Sessions are scoped by
API URL and project, including custom API origins.

Pass a `Transport` to `VaifClient` to use a fake or a custom HTTP implementation.
`OkHttpTransport` accepts a configured OkHttp client and disables redirects and
connection retries. Do not attach credential-adding interceptors or cookie jars to
a transport used for signed storage URLs. Injected transports and WebSocket clients
remain caller-owned; close their resources yourself. The SDK closes its own transport
and active subscriptions when `VaifClient.close()` is called.

## Versioning and support policy

The first Kotlin release is planned as 1.0.0.
Kotlin uses independent semantic versioning for API contract v1. After release,
breaking API changes require a major version; compatible features use minor versions
and fixes use patch versions. Security fixes target the latest supported release. See [CHANGELOG.md](CHANGELOG.md).

The source has not received release acceptance. Dependency scan, Android device
and live API checks remain release gates. Fake conformance tests verify client
wire behavior; server authorization requires tests against a configured API.

## Dependency and API checks

Each module locks its resolved dependencies in Gradle lockfiles. CI
scans runtime, test, documentation and build dependencies with a commit-pinned
OSV-Scanner action. Any known vulnerability or scanner error fails CI. No NVD key
is needed. Dependency locks constrain versions; they do not prove package integrity.
Explicit API mode requires declared visibility and return types. Compiler warnings
and undocumented public APIs fail the build.

## Security

Report vulnerabilities privately to security@vaif.studio; see [SECURITY.md](SECURITY.md).
Do not post tokens or API keys in [issues](https://github.com/vaifstudio/vaif-kotlin/issues).

## License

[MIT](LICENSE), Copyright (c) 2026 VAIF Studio LLC. See
[THIRD_PARTY_NOTICES.md](THIRD_PARTY_NOTICES.md) for dependency notices.
