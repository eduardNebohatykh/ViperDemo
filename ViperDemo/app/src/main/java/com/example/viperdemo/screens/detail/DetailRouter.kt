package com.example.viperdemo.screens.detail

class DetailRouter(private val activity: DetailActivity) : DetailContract.Router {

    override fun finish() {
        activity.finish()
    }
}