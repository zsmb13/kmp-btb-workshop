package com.jetbrains.weatherapp

import android.app.Application
import cache.filePath

class WebinarApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        filePath = "${filesDir.path}/country_cache.json"
    }
}