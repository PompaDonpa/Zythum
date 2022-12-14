buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath (Build.androidBuildTools)
        classpath (Build.hiltAndroidGradlePlugin)
        classpath (Build.kotlinGradlePlugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id ("com.android.application") version "7.2.2" apply false
    id ("com.android.library") version "7.2.2" apply false
    kotlin ("android") version "1.7.10" apply false
    kotlin ("jvm") version "1.6.10" apply false
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
