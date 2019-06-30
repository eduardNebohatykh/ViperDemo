package com.example.viperdemo.app

import android.app.Application
import com.example.viperdemo.app.di.AppComponent
import com.example.viperdemo.app.di.AppModule
import com.example.viperdemo.app.di.DaggerAppComponent

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .context(this)
            .plus(AppModule())
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        component.inject(this)
    }
}