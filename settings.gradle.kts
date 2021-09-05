rootProject.name = "Kotlin Practise Gradle Scaling"
include(":app")
include(":modulePF")
include(":modulePJ")
include(":moduleOther")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

includeBuild("includedBuilds/build-configuration")
includeBuild("includedBuilds/build-source")
