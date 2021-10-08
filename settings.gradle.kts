rootProject.name = "testRemote"
include("testRemoteA")
buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    dependencies {
        classpath("com.yanwq.plugin:java-modular:1.0-SNAPSHOT")
    }
}

apply(plugin = "java-modular-settings")