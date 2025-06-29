plugins {
    id("java")
}

group = "vn.edu.ptit.duongvct"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
val slf4jVersion = "2.0.17"
dependencies {
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:${slf4jVersion}")
    implementation("org.slf4j:slf4j-simple:${slf4jVersion}")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}