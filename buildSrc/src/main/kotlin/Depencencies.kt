object AppPath
{
    const val gradle="com.android.tools.build:gradle:3.5.1"
    const val kotlinPlugin="org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61"

}



//Now Open App Leavel build.gradle.kts for modification

//Frist replace plugin part
object PluginsId
{
    const val androidApplication="com.android.application"
    const val kotlin_android="kotlin-android"
    const val kotlin_extension = "kotlin-android-extensions"
}

//Repace anddroid Parts
object App
{
    const val compileSdk=29
    const val buildToolVersion = "29.0.2"
    const val applicationId = "com.sippitechnologies.ktsforandroid"
    const val minSdkVersion=15
    const val targetSdkVersion =29
    const val versionCode =1
    const val versionName="1.0"
    const val testRunner="androidx.test.runner.AndroidJUnitRunner"
}

//Replace Depencies block
object  Libraries
{
    object Versions{
        const val kotlin="1.3.61"
        const val appCompat="1.1.0"
        const val ktx="1.2.0"
        const val constraintLayout="1.1.3"
        const val junit = "4.12"
        const val junit_ext="1.1.1"
        const val espresso="3.2.0"

    }
    object Lib
    {
        const val kotlin ="org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        const val appcompat="androidx.appcompat:appcompat:${Versions.appCompat}"
        const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
        const val constraintLayout="androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"


    }
    object AndroidTesting
    {
        const val espresso ="androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
    object UnitTesting
    {
        const val junit = "junit:junit:${Versions.junit}"
        const val junitext="androidx.test.ext:junit:${Versions.junit_ext}"

    }
}
