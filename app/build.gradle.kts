plugins {
    id("com.android.application")
}

android {
    namespace = "com.arnold.abouttime"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.arnold.abouttime"
        minSdk = 36
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    enableKotlin = false
}

dependencies {
}