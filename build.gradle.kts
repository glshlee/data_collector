plugins {
    val kotlinVersion = "1.4.31"

    id("org.springframework.boot") version "2.4.1"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
}

group = "com.hoon"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_13

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // webflux
    implementation("org.springframework.boot:spring-boot-starter-webflux")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "13"
        }
    }
}
