plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "androidx.preference"
    compileSdk = 35

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}
dependencies {
    api("org.jspecify:jspecify:1.0.0")
    api("androidx.annotation:annotation:1.9.1")
    api("androidx.appcompat:appcompat:1.7.0")
    api("androidx.core:core-ktx:1.15.0")
    implementation("androidx.collection:collection-ktx:1.4.5")
    api("androidx.activity:activity-ktx:1.9.3")
    api("androidx.fragment:fragment-ktx:1.8.5")
    api("androidx.recyclerview:recyclerview:1.3.2")
    api("androidx.slidingpanelayout:slidingpanelayout:1.2.0")
    api("com.google.android.material:material:1.12.0")
}