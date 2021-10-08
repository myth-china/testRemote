plugins {
    kotlin("jvm") version "1.5.31"
    `java-modular-project`
}

group = "com.wilfred"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    dependencies {
        classpath("com.yanwq.plugin:java-modular:1.0-SNAPSHOT")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
}