package com.example.viperdemo.screens.main

import com.example.viperdemo.app.model.Joke
import com.example.viperdemo.screens.detail.DetailActivity

class MainRouter(private val activity: MainActivity) : MainContract.Router {

    override fun finish() {
        activity.finish()
    }

    override fun openFullJoke(joke: Joke) {
        DetailActivity.launch(activity, joke)
    }
}