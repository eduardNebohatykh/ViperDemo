package com.example.viperdemo.screens.splash.di

import com.example.viperdemo.app.di.ActivityScope
import com.example.viperdemo.screens.splash.SplashActivity
import com.example.viperdemo.screens.splash.SplashContract
import com.example.viperdemo.screens.splash.SplashPresenter
import com.example.viperdemo.screens.splash.SplashRouter
import dagger.Module
import dagger.Provides

@Module
class SplashModule {

    @Provides
    @ActivityScope
    fun router(activity: SplashActivity): SplashContract.Router = SplashRouter(activity)

    @Provides
    @ActivityScope
    fun presenter(router: SplashContract.Router) = SplashPresenter(router)
}
