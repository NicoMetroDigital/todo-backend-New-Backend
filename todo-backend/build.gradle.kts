plugins {
    id("org.springframework.boot") version "2.5.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.withType<org.springframework.boot.gradle.tasks.run.BootRun> {
    mainClass.set("/home/nico/Downloads/todo-backend/todo-backend/src/main/kotlin/com/example/todo/TodoApplication.kt") // Hier den vollständigen Pfad zur Hauptklasse angeben
}
bootJar {
    mainClass.set("/home/nico/Downloads/todo-backend/todo-backend/src/main/kotlin/com/example/todo/TodoApplication.kt")
}
tasks.withType<Jar> {
    enabled = true
}
