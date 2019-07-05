package com.example.viperdemo.screens.detail

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import com.example.viperdemo.BuildConfig
import com.example.viperdemo.app.model.Joke

class DetailActivity: AppCompatActivity() {

    companion object {
        private const val JOKE = "${BuildConfig.APPLICATION_ID}_JOKE"

        fun launch(context: Context, data: Joke) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(JOKE, data)
            context.startActivity(intent)
        }
    }
}