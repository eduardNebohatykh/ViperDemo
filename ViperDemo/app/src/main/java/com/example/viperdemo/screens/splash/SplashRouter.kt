package com.example.viperdemo.screens.splash

import com.example.viperdemo.screens.main.MainActivity

class SplashRouter(private val activity: SplashActivity) : SplashContract.Router {

    override fun openMain() {
        MainActivity.launch(activity)
        activity.finish()
    }
}