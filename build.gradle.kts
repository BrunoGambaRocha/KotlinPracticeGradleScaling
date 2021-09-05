plugins {
    id("my-project-plugin")
}
buildscript {
    val kotlin_version by extra("1.5.10")
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}
