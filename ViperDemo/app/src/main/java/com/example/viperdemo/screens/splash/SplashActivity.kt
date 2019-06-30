package com.example.viperdemo.screens.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.viperdemo.R
import com.example.viperdemo.app.App
import com.example.viperdemo.screens.splash.di.DaggerSplashComponent
import com.example.viperdemo.screens.splash.di.SplashComponent
import com.example.viperdemo.screens.splash.di.SplashModule
import javax.inject.Inject

class SplashActivity : AppCompatActivity(), SplashContract.View {

    @Inject
    lateinit var presenter: SplashPresenter

    val component: SplashComponent by lazy {
        DaggerSplashComponent.builder()
            .appComponent((application as App).component)
            .activity(this)
            .plus(SplashModule())
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        component.inject(this)
        presenter.bindView(this)
        presenter.onViewCreated()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unbindView()
    }
}