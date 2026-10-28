# Third-party notices

The checked-in Gradle wrapper scripts and `gradle-wrapper.jar` are from Gradle,
Copyright the original authors, distributed under the
[Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0). The wrapper runs
the pinned Gradle 8.14.5 distribution.
Its JAR SHA-256 is `7d3a4ac4de1c32b59bc6a4eb8ecb8e612ccd0cf1ae1e99f66902da64df296172`.
The Gradle distribution is downloaded separately and checked against the SHA-256 in
`gradle/wrapper/gradle-wrapper.properties`.

Dependencies are resolved rather than vendored: Kotlin, kotlinx.coroutines,
kotlinx.serialization, OkHttp and Okio (Apache 2.0); JUnit (EPL 2.0, tests only);
the Vanniktech Maven Publish plugin and Dokka (Apache 2.0, build only). The Android
module compiles and tests against the runner's Android SDK platform JAR (Android
platform licenses). Android platform classes are not included in the Android
storage artifact or its runtime dependencies.
Refer to each dependency's published POM/license for its notices.
