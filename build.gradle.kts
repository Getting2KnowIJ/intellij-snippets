plugins {
    java
}

group = "org.getting2knowij"
version = "1.0.3"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.11")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11")
}

tasks.test {
    useJUnitPlatform()
}