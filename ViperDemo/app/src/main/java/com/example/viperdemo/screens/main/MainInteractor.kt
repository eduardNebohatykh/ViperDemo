package com.example.viperdemo.screens.main

import com.example.viperdemo.app.model.Joke
import com.example.viperdemo.screens.main.data.MainRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainInteractor(private val repo: MainRepository) : MainContract.Interactor {
    private val compositeDisposable = CompositeDisposable()

    override fun getJokes(onSuccess: (List<Joke>) -> Unit, onError: (Throwable) -> Unit) {
        val disposable = repo.getJokes()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError(onError)
            .doOnSuccess(onSuccess)
            .subscribe()

        compositeDisposable.add(disposable)
    }

    fun dispose() = compositeDisposable.dispose()
}