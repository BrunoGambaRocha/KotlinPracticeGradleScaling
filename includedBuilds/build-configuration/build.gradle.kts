plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

group = "br.com.brunoti.cursos.dio.gradle"
version = "1.0.0"

gradlePlugin {
    plugins {
        register("my-build-configuration-plugin") {
            id = "my-build-configuration-plugin"
            implementationClass = "BuildConfigurationPlugin"
        }
    }
}
