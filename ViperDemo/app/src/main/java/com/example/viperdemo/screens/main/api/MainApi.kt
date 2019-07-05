package com.example.viperdemo.screens.main.api

import com.example.viperdemo.app.model.Joke
import io.reactivex.Single
import retrofit2.http.GET

interface MainApi {

    @GET("api/random")
    fun getData(): Single<List<Joke>>
}