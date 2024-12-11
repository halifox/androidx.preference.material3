plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "androidx.preference"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    api("org.jspecify:jspecify:1.0.0")
    api("androidx.annotation:annotation:1.8.1")
    api("androidx.appcompat:appcompat:1.1.0")
    // Use the latest version of core library for verifying insets visibility
    api("androidx.core:core:1.6.0")
    implementation("androidx.collection:collection:1.4.2")
    api("androidx.activity:activity-ktx:1.5.1")
    api("androidx.fragment:fragment-ktx:1.3.6")
    api("androidx.recyclerview:recyclerview:1.0.0")
    api("androidx.slidingpanelayout:slidingpanelayout:1.2.0")
}