object AppPath
{
    object Versions{
        const val gradle="3.5.1"
        const val kotlingradle="1.3.61"
        const val junit5Plugin="1.6.0.0"
    }
    const val gradle="com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinPlugin="org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlingradle}"
    //Add Class Path
    const val junit5Plugin="de.mannodermaus.gradle.plugins:android-junit5:${Versions.junit5Plugin}"

}



//Now Open App Leavel build.gradle.kts for modification

//Frist replace plugin part
object PluginsId
{
    const val androidApplication="com.android.application"
    //Adding Android Library Plugin Id
    const val android_library = "com.android.library"
    const val kotlin_android="kotlin-android"
    const val kotlin_extension = "kotlin-android-extensions"
    const val junit5= "de.mannodermaus.android-junit5"
   
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
        const val jupiterapi="5.6.0"
        const val junitespresso="1.2.0"

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
        const val junit5testcore = "de.mannodermaus.junit5:android-test-core:${Versions.junitespresso}"
        const val junit5androidrunner ="de.mannodermaus.junit5:android-test-runner:${Versions.junitespresso}"

    }
    object UnitTesting
    {
        const val junit = "junit:junit:${Versions.junit}"
        const val junitext="androidx.test.ext:junit:${Versions.junit_ext}"
        const val junit5="org.junit.jupiter:junit-jupiter-api:${Versions.jupiterapi}"
        const val jupiterengine="org.junit.jupiter:junit-jupiter-engine:${Versions.jupiterapi}"
        const val jupiterparams="org.junit.jupiter:junit-jupiter-params:${Versions.jupiterapi}"
        const val jupitervintage ="org.junit.vintage:junit-vintage-engine:${Versions.jupiterapi}"


        // (Optional) If you need "Parameterized Tests"


        // (Optional) If you also have JUnit 4-based tests


    }
}
