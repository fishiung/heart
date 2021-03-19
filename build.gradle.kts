plugins {
    id("org.jetbrains.kotlin.jvm") apply false
}

allprojects {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://maven.aliyun.com/nexus/content/groups/public");
        }
    }
}
