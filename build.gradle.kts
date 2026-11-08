plugins {
    java
}

group = "dev.villagergive"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    // Change this to match your server version (check papermc.io/downloads for the exact API version)
    compileOnly("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")
}

java {
    // Use the Java version your Paper build requires (21 for 1.21.x, newer for 26.x)
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
