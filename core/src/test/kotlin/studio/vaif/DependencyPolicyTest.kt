package studio.vaif

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DependencyPolicyTest {
    private val root: Path = Paths.get(System.getProperty("vaif.sdkRoot"))
    private fun read(path: String) = String(Files.readAllBytes(root.resolve(path)), Charsets.UTF_8)

    @Test fun `locked dependency graph and fail closed CI scan are required`() {
        val build = read("build.gradle.kts")
        assertTrue(build.contains("lockAllConfigurations()"))
        assertTrue(build.contains("LockMode.STRICT"))
        assertFalse(build.contains("org.owasp.dependencycheck"))
        for (file in listOf("core/gradle.lockfile", "android/gradle.lockfile", "buildscript-gradle.lockfile")) {
            assertTrue(Files.isRegularFile(root.resolve(file)), "Generate and review $file with --write-locks")
        }
        for (file in listOf("core/build.gradle.kts", "android/build.gradle.kts", "build.gradle.kts")) {
            val coordinates = Regex("""(?:api|testImplementation|testRuntimeOnly)\("([^"]+)"\)""")
                .findAll(read(file)).map { it.groupValues[1] }
            for (coordinate in coordinates) {
                val version = coordinate.substringAfterLast(":")
                assertFalse(version.contains("+") || version.startsWith("latest.") ||
                    version.startsWith("[") || version.startsWith("("), "No dynamic selector: $coordinate")
            }
        }
        val workflow = read(".github/workflows/ci.yml")
        assertTrue(Regex("google/osv-scanner-action/osv-scanner-action@[a-f0-9]{40}").containsMatchIn(workflow))
        assertTrue(workflow.contains("--lockfile="))
        for (bypass in listOf("continue-on-error: true", "--severity", "--ignore", "--skip")) {
            assertFalse(workflow.contains(bypass), "Scan must fail closed: $bypass")
        }
    }
}
