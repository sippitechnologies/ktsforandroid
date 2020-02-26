plugins{
    //Replace thes hardcode values
    id(PluginsId.androidApplication)
    id(PluginsId.kotlin_android)
    id(PluginsId.kotlin_extension)
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
    
}
//Please Like Share and Subscribe and write comment for suggestion and feedback
//Thanks for your Time 