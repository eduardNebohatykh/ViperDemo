package com.example.viperdemo.screens.main.data

import com.example.viperdemo.app.model.Joke
import com.example.viperdemo.screens.main.api.MainApi
import com.example.viperdemo.screens.main.MainContract
import io.reactivex.Single

class MainRepository(private val api: MainApi) : MainContract.Repo {

    override fun getJokes(): Single<List<Joke>> = api.getData()
}