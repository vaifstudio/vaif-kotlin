import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import org.gradle.api.artifacts.dsl.LockMode
import org.jetbrains.dokka.gradle.DokkaExtension
import org.jetbrains.dokka.gradle.engine.parameters.VisibilityModifier

// Activate classpath locks before the plugins block resolves build dependencies.
buildscript {
    configurations.classpath {
        resolutionStrategy.activateDependencyLocking()
        resolutionStrategy.eachDependency {
            when {
                requested.group.startsWith("com.fasterxml.jackson") && requested.name.startsWith("jackson-") -> useVersion("2.18.12")
                requested.group == "org.freemarker" && requested.name == "freemarker" -> useVersion("2.3.35")
                requested.group == "org.jsoup" && requested.name == "jsoup" -> useVersion("1.23.2")
            }
        }
    }
}

plugins {
    kotlin("jvm") version "2.4.21" apply false
    kotlin("plugin.serialization") version "2.4.21" apply false
    id("com.vanniktech.maven.publish") version "0.34.0" apply false
    id("org.jetbrains.dokka") version "2.2.0" apply false
}

allprojects {
    // Dokka 2.2.0 pulls Jackson 2.15.3, FreeMarker 2.3.32 and jsoup 1.16.1; these are their patched releases.
    configurations.matching { it.name.startsWith("dokka") && it.name.contains("Resolver") }.configureEach {
        resolutionStrategy.eachDependency {
            when {
                requested.group.startsWith("com.fasterxml.jackson") && requested.name.startsWith("jackson-") -> useVersion("2.18.12")
                requested.group == "org.freemarker" && requested.name == "freemarker" -> useVersion("2.3.35")
                requested.group == "org.jsoup" && requested.name == "jsoup" -> useVersion("1.23.2")
            }
        }
    }
    dependencyLocking {
        lockAllConfigurations()
        lockMode.set(LockMode.STRICT)
    }
    // Resolve unused configurations as well so documentation, compiler and test
    // dependencies are represented in the graph reviewed by OSV.
    tasks.register("resolveAndLockAll") {
        doLast {
            configurations.filter { it.isCanBeResolved }.forEach { it.resolve() }
            buildscript.configurations.filter { it.isCanBeResolved }.forEach { it.resolve() }
        }
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "java-library")
    apply(plugin = "com.vanniktech.maven.publish")
    apply(plugin = "org.jetbrains.dokka")
    group = rootProject.group
    version = rootProject.version
    // Consumer dependencies require Kotlin 2.1; the build compiler version is independent.
    dependencies.add("api", "org.jetbrains.kotlin:kotlin-stdlib:2.1.21")

    // Compile application snippets directly from the README so examples cannot drift
    // away from the exported API. Gradle DSL installation instructions are excluded.
    val examplesDirectory = layout.buildDirectory.dir("generated/readme")
    val prepareReadmeExamples = tasks.register("prepareReadmeExamples") {
        inputs.file(rootProject.file("README.md"))
        outputs.dir(examplesDirectory)
        doLast {
            val directory = examplesDirectory.get().asFile
            directory.deleteRecursively()
            directory.mkdirs()
            Regex("```kotlin\\n(.*?)\\n```", RegexOption.DOT_MATCHES_ALL)
                .findAll(rootProject.file("README.md").readText()).forEachIndexed { index, match ->
                    val source = match.groupValues[1]
                    if (!source.startsWith("// build.gradle.kts") &&
                        source.startsWith("// Android example") == (project.name == "android")) {
                        directory.resolve("ReadmeExample$index.kt").writeText(source + "\n")
                    }
                }
        }
    }
    extensions.configure<org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension> {
        explicitApi()
        jvmToolchain(17)
        compilerOptions {
            languageVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.fromVersion("2.0"))
            apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.fromVersion("2.0"))
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8)
            // Kotlin 2.0 is supported but deprecated by this compiler; retain consumer compatibility while rejecting source warnings.
            freeCompilerArgs.add("-Xsuppress-version-warnings")
            allWarningsAsErrors.set(true)
        }
        sourceSets.named("test") { kotlin.srcDir(prepareReadmeExamples) }
    }
    extensions.configure<DokkaExtension> {
        dokkaPublications.named("html") {
            failOnWarning.set(true)
        }
        dokkaSourceSets.configureEach {
            reportUndocumented.set(true)
            documentedVisibilities.set(setOf(VisibilityModifier.Public, VisibilityModifier.Protected))
            suppressGeneratedFiles.set(false)
        }
    }
    tasks.named("check") { dependsOn("dokkaGenerate") }
    tasks.withType<JavaCompile>().configureEach { options.release.set(8) }
    tasks.withType<Jar>().configureEach {
        from(rootProject.file("LICENSE")) { into("META-INF") }
        from(rootProject.file("THIRD_PARTY_NOTICES.md")) { into("META-INF") }
    }
    tasks.withType<Test>().configureEach {
        systemProperty("vaif.sdkRoot", rootProject.projectDir.absolutePath)
        useJUnitPlatform()
        maxParallelForks = 1
        testLogging { events("passed", "skipped", "failed") }
    }
    extensions.configure<com.vanniktech.maven.publish.MavenPublishBaseExtension> {
        configure(KotlinJvm(javadocJar = JavadocJar.Dokka("dokkaGeneratePublicationHtml"), sourcesJar = true))
        coordinates(rootProject.group.toString(), if (project.name == "core") "vaif-kotlin" else "vaif-kotlin-android", rootProject.version.toString())
        // Explicit release property: normal builds require no credentials/signing key.
        if (providers.gradleProperty("release").orNull == "true") {
            publishToMavenCentral(automaticRelease = false)
            signAllPublications()
        }
        pom {
            name.set(if (project.name == "core") "VAIF Kotlin SDK" else "VAIF Kotlin Android token storage")
            description.set("Native Kotlin client for VAIF Studio app users, data, storage, functions and realtime")
            url.set("https://github.com/vaifstudio/vaif-kotlin")
            licenses { license { name.set("MIT License"); url.set("https://opensource.org/licenses/MIT") } }
            developers { developer { id.set("vaifstudio"); name.set("VAIF Studio LLC"); url.set("https://github.com/vaifstudio/vaif-kotlin") } }
            scm { url.set("https://github.com/vaifstudio/vaif-kotlin"); connection.set("scm:git:https://github.com/vaifstudio/vaif-kotlin.git") }
        }
    }
}
