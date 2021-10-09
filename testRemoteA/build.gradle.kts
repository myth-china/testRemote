plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "com.wilfred.testremote"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    maven {
        url = uri("http://nexus.k8s.qa1fdg.net/repository/maven-snapshots/")
        isAllowInsecureProtocol = true
    }
}

dependencies {
    implementation(kotlin("stdlib"))
}

publishing {
    publications {
        create<MavenPublication>("testRemoteA") {
            from(components.getByName("java"))
        }
    }
}