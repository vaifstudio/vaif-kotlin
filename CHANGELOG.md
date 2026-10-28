# Changelog

## 1.0.0 — Unreleased

The first native Kotlin SDK for JVM and Android, for API contract v1. It has not
been tagged or published. The hosted API and console are not available yet.

### Added

- Authentication with coroutines: app-user sign-up, sign-in, sign-out, refresh,
  current user and password reset; the five MFA operations; OAuth with S256 PKCE.
  Console account sign-up and password reset fail locally with `CONSOLE_ONLY`.
- Pluggable session storage. The default keeps tokens in memory. The optional
  `vaif-kotlin-android` artifact stores them with Android Keystore AES-GCM on
  API 23 and later.
- An immutable data query builder with filters, ordering, ranges, limits, counts,
  row writes, upserts and bulk writes with equality filters.
- Storage uploads with an exact size, downloads, listing, deletion and signed URLs;
  function invocation.
- Realtime subscriptions over OkHttp WebSockets with the auth, welcome and
  subscribe handshake, database change events, protocol pings, explicit
  credential refresh and cleanup on cancellation or close.
- 775 spec-generated suspend operations. The 168 operations without a method are
  listed with a reason; 134 are platform-staff operations, identified by their
  `/admin` or `/auth/impersonate` path or their `admin` tag.
- Shared conformance cases run against a fake transport and a loopback WebSocket
  server.

### Security

- A refresh that finishes after sign-out or a session replacement fails with
  `SESSION_CHANGED` and cannot restore or overwrite credentials.
- Replacing a session deletes the stored credential before saving the new one.
  Sign-out revokes the session on the server with the refresh credential and
  reports a failure to delete local credentials.
- Base, signed and OAuth URLs must use HTTPS, except HTTP to `localhost`,
  `127.0.0.1` and `::1`. Realtime uses WSS, or WS for those hosts.
- Redirects are not followed. Signed transfers carry no SDK credentials, and a
  failed transfer reports only its HTTP status.
- Session storage keys are scoped to the API URL and project ID.
- Network, event-stream, realtime, storage and response-shape failures throw
  `VaifException`; coroutine cancellation propagates unchanged.

### Build

- Kotlin 2.4.21 compiler with language and API level 2.0, Java 8 bytecode and a
  Kotlin 2.1.21 consumer minimum. Explicit API mode; compiler and Dokka warnings
  fail the build.
- Strict Gradle dependency locks. CI scans every lockfile with OSV-Scanner and
  fails on any known vulnerability or scanner error.
- README examples compile as test sources.

Not included in this version: automatic retry or replay of HTTP requests,
background token refresh, realtime reconnection, multipart upload coordination,
and broadcast or presence helpers. Live API conformance, Android device
validation and signed Maven artifacts remain release checks.
