package com.example.viperdemo.screens.detail

import com.example.viperdemo.app.model.Joke

interface DetailContract {

    interface View {
        fun publishData(joke: Joke)

        fun showMessage(msg: Int)
    }

    interface Presenter {
        fun bindView(view: DetailContract.View)

        fun unbindView()

        fun onViewCreated(joke: Joke)

        fun onBackClicked()

        fun onEmptyData(msg: Int)
    }

    interface Router {
        fun finish()
    }
}