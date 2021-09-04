rootProject.name = "Kotlin Practise Gradle Scaling"
include(":app")
include(":module1")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

includeBuild("includedBuilds/build-configuration")
includeBuild("includedBuilds/build-source")