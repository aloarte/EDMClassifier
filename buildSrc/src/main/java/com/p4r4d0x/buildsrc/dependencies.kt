package com.p4r4d0x.buildsrc

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha08"
    const val jdkDesugar = "com.android.tools:desugar_jdk_libs:1.0.9"
    const val junit = "junit:junit:4.13"
    const val roboelectric = "org.robolectric:robolectric:4.2.1"
    const val mock = "io.mockk:mockk-android:1.9.3"
    const val material = "com.google.android.material:material:1.3.0"
    const val databinding = "com.android.databinding:compiler:3.1.4"
    const val omRecorder = "com.kailashdabhi:om-recorder:1.1.5"

    object Kotlin {
        private const val version = "1.4.30"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Koin {
        private const val version = "2.1.5"
        const val core = "org.koin:koin-core:$version"
        const val androidViewmodel = "org.koin:koin-android-viewmodel:$version"
        const val test = "org.koin:koin-test:$version"
    }

    object Coroutines {
        private const val version = "1.4.2"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.2.0"
        const val coreKtx = "androidx.core:core-ktx:1.5.0-beta01"

        object Test {
            private const val version = "1.3.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            object

            const

            val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        }

        object Lifecycle {
            private const val version = "2.3.0-beta01"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
        }
    }
}
