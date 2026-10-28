package studio.vaif

import java.nio.file.Files
import java.nio.file.Paths
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/** JUnit Jupiter silently skips a @Test method that returns a value, such as `= runBlocking { ... }` inferring kotlin.Unit. */
class TestDiscoveryTest {
    @Test fun `every test method returns void so JUnit runs it`() {
        val root = Paths.get(TestDiscoveryTest::class.java.protectionDomain.codeSource.location.toURI())
        val classNames = Files.walk(root).use { paths ->
            paths.filter { it.fileName.toString().endsWith(".class") }.map {
                root.relativize(it).toString().removeSuffix(".class").replace(root.fileSystem.separator, ".")
            }.toList()
        }
        val skipped = classNames.flatMap { Class.forName(it, false, javaClass.classLoader).declaredMethods.toList() }
            .filter { it.isAnnotationPresent(Test::class.java) && it.returnType != Void.TYPE }
            .map { "${it.declaringClass.simpleName}.${it.name}" }
            .sorted()
        assertEquals(emptyList<String>(), skipped)
    }
}
