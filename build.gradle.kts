import com.github.patrickthedev.kenburnsimage.Configuration

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

group = Configuration.artifactGroup
version = Configuration.versionCode