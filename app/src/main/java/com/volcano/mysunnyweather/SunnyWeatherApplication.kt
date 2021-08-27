package com.volcano.mysunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "0CAjvoIA6LZ7UQvz"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}