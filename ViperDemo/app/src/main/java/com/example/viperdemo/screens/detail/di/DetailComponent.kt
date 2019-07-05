package com.example.viperdemo.screens.detail.di

import com.example.viperdemo.app.di.ActivityScope
import com.example.viperdemo.app.di.AppComponent
import com.example.viperdemo.screens.detail.DetailActivity
import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(modules = [DetailModule::class], dependencies = [AppComponent::class])
interface DetailComponent {

    fun inject(target: DetailActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun activity(activity: DetailActivity): Builder

        fun appComponent(component: AppComponent): Builder

        fun plus(module: DetailModule): Builder

        fun build(): DetailComponent
    }
}