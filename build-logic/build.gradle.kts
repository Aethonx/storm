plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies{
    implementation("com.github.jengelman.gradle.plugins", "shadow", "6.1.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")
    implementation("org.jlleitschuh.gradle.ktlint:org.jlleitschuh.gradle.ktlint.gradle.plugin:10.2.0")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}