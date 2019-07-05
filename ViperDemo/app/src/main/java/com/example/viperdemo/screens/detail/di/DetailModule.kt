package com.example.viperdemo.screens.detail.di

import com.example.viperdemo.app.di.ActivityScope
import com.example.viperdemo.screens.detail.DetailActivity
import com.example.viperdemo.screens.detail.DetailContract
import com.example.viperdemo.screens.detail.DetailPresenter
import com.example.viperdemo.screens.detail.DetailRouter
import dagger.Module
import dagger.Provides

@Module
class DetailModule {

    @Provides
    @ActivityScope
    fun router(activity: DetailActivity): DetailContract.Router = DetailRouter(activity)

    @Provides
    @ActivityScope
    fun presenter(router: DetailContract.Router) = DetailPresenter(router)
}