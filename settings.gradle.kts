pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    val kotlinVersion = "1.4.30"
    val springBootVersion = "2.4.3"
    val springDependencyManagement = "1.0.11.RELEASE"

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm",
                "org.jetbrains.kotlin.plugin.spring",
                "org.jetbrains.kotlin.plugin.jpa" -> useVersion(kotlinVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyManagement)
            }
        }
    }
}

rootProject.name = "heart"

include("problems")
include("springboot")