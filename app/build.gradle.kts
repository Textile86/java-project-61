plugins {
    id("com.github.ben-manes.versions") version "0.51.0"
    id("org.sonarqube") version "6.2.0.5505"
    id("application")
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

application {
    mainClass.set("hexlet.code.App")
}

sonar {
    properties {
        property("sonar.projectKey", "Textile86_java-project-61")
        property("sonar.organization", "textile86")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

checkstyle {
    toolVersion = "10.12.5" // Актуальная версия
    configFile = file("${project.rootDir}/config/checkstyle/checkstyle.xml")
    isIgnoreFailures = false // Остановка сборки при ошибках
}

tasks.withType<JavaExec> {
    standardInput = System.`in`
}