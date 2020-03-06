plugins{
    //Replace thes hardcode values
    id(PluginsId.android_library) //Replace with Android Library
    id(PluginsId.kotlin_android)
    id(PluginsId.kotlin_extension)
}

android {
    //Lets Replace followings hardcoded values
    compileSdkVersion(App.compileSdk)
    buildToolsVersion= App.buildToolVersion
    defaultConfig {
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