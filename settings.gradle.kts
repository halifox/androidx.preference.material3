pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven {
            url = uri("https://maven.pkg.github.com/halifox/androidx.preference.material3")
            credentials {
                username = "halifox"
                password = "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"
            }
        }
    }
}

rootProject.name = "preference"
include(":app")
include(":preference")
