// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        jcenter()
        //Use Deepencies Delecared in this file
    }
    dependencies {
        classpath (AppPath.gradle)
        classpath(AppPath.kotlinPlugin)
        //Add Junit 5 here
        classpath(AppPath.junit5Plugin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts.kts.kts.kts files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}

