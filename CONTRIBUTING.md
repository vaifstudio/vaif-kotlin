# Contributing

Report defects and propose features in [GitHub issues](https://github.com/vaifstudio/vaif-kotlin/issues).
Include the SDK, Kotlin, JDK and Android versions as applicable, expected and actual
behavior, and a minimal reproduction. Remove credentials and personal data.
Report vulnerabilities privately using [SECURITY.md](SECURITY.md).

Pull requests should address one change and include regression tests. Discuss
larger API changes in an issue first.
Do not edit `core/src/main/kotlin/studio/vaif/generated` or the shared conformance JSON
by hand: describe the contract change so maintainers can regenerate them.

## Development

Use JDK 17 and the checked-in wrapper; no global Gradle installation is required.
Build core locally. GitHub CI builds and tests the Android adapter against its
preinstalled Android API 35. Dependencies resolve from Maven Central and the Gradle
Plugin Portal.

```sh
git clone https://github.com/vaifstudio/vaif-kotlin.git
cd vaif-kotlin
./gradlew :core:build :core:conformance :core:dokkaGenerate --no-daemon
```

The shared conformance cases are included as test resources. They use a fake HTTP
transport and loopback WebSocket server; they do not require an API account.
Gradle uses strict dependency locks. CI runs OSV-Scanner on the lockfiles and fails
on any known vulnerability or scanner error. No NVD key is needed. Public APIs require KDoc and explicit
visibility and return types; compiler and Dokka warnings fail the build.

Follow [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md). Contributions are licensed under
the [MIT License](LICENSE).
