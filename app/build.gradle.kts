plugins {
    id("my-application-plugin")
}

dependencies {
    implementation(project(":modulePF"))
    implementation(project(":modulePJ"))
    implementation(project(":moduleOther"))
}