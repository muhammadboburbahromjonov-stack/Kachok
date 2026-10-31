plugins {
    id("com.android.application")
}

android {
    namespace = "uz.kundalik.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "uz.kundalik.app"
        minSdk = 24
        targetSdk = 34
        versionCode = (System.getenv("GITHUB_RUN_NUMBER") ?: "1").toInt()
        versionName = "1.0." + (System.getenv("GITHUB_RUN_NUMBER") ?: "0")
    }

    // A committed debug-style key (like the React Native template's) so every CI build
    // is signed the same way and installs as an update over the previous APK.
    signingConfigs {
        create("shared") {
            storeFile = file("kundalik.keystore")
            storePassword = "android"
            keyAlias = "kundalik"
            keyPassword = "android"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("shared")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.11.0")
}
