plugins {
    kotlin("jvm")
    `java-modular-project`
}

group = "com.wilfred"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}