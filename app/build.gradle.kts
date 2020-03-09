plugins{
    //Replace thes hardcode values
    id(PluginsId.androidApplication)
    id(PluginsId.kotlin_android)
    id(PluginsId.kotlin_extension)
    id(PluginsId.junit5)
}

android {
    //Lets Replace followings hardcoded values
    compileSdkVersion(App.compileSdk)
    buildToolsVersion= App.buildToolVersion
    defaultConfig {
        applicationId= App.applicationId
        minSdkVersion(App.minSdkVersion)
        targetSdkVersion(App.targetSdkVersion)
        versionCode =App.versionCode
        versionName =App.versionName
        testInstrumentationRunner =App.testRunner
        testInstrumentationRunnerArgument("runnerBuilder", "de.mannodermaus.junit5.AndroidJUnit5Builder")
    }
    compileOptions {
        setSourceCompatibility(JavaVersion.VERSION_1_8)
        setTargetCompatibility(JavaVersion.VERSION_1_8)
    }

    // 4) JUnit 5 will bundle in files with identical paths; exclude them
    packagingOptions {
        exclude("META-INF/LICENSE*")
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled =false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    //Replace these Hard Code Values
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libraries.Lib.kotlin)
    implementation(Libraries.Lib.appcompat)
    implementation(Libraries.Lib.ktx)
    implementation (Libraries.Lib.constraintLayout)
    testImplementation(Libraries.UnitTesting.junit)
    androidTestImplementation(Libraries.UnitTesting.junitext)
    androidTestImplementation(Libraries.AndroidTesting.espresso)
    //Junit 5
    testImplementation(Libraries.UnitTesting.junit5)

    testRuntimeOnly(Libraries.UnitTesting.jupiterengine)

    // (Optional) If you need "Parameterized Tests"
    testImplementation(Libraries.UnitTesting.jupiterparams)

    // (Optional) If you also have JUnit 4-based tests

    testRuntimeOnly(Libraries.UnitTesting.jupitervintage)

    //Junit 5 espresso
    androidTestImplementation(Libraries.AndroidTesting.junit5testcore)
    androidTestRuntimeOnly(Libraries.AndroidTesting.junit5androidrunner)

    //Add module to app
    implementation(project(":testmodule"))
    
}
//Please Like Share and Subscribe and write comment for suggestion and feedback
//Thanks for your Time 