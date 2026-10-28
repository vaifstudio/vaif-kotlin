plugins { kotlin("jvm") }

// Keep this a JVM JAR. CI supplies its preinstalled platform API without adding
// Android runtime classes or a Robolectric platform artifact to the dependency graph.
val sdkRoot = providers.environmentVariable("ANDROID_HOME")
    .orElse(providers.environmentVariable("ANDROID_SDK_ROOT"))
val androidApi = sdkRoot.map { file("$it/platforms/android-35/android.jar") }
val androidClasspath = files(provider { androidApi.orNull?.let { listOf(it) } ?: emptyList() })
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    doFirst {
        require(androidApi.orNull?.isFile == true) {
            "Android API 35 must be installed under ANDROID_HOME (or ANDROID_SDK_ROOT); build :core locally and :android in CI"
        }
    }
}
dependencies {
    api(project(":core"))
    compileOnly(androidClasspath)
    testImplementation(androidClasspath)
    testImplementation("org.junit.jupiter:junit-jupiter:5.12.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
