plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

kotlin {
    //Add Deps to compilation, so it will become avaiable in main project
    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}

gradlePlugin {
    plugins {
        register("my-project-plugin") {
            id = "my-project-plugin"
            implementationClass = "ProjectPlugin"
        }
    }
}

dependencies{
    implementation("com.android.tools.build:gradle:${Deps.Version.agp}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Deps.Version.kotlin}")
}