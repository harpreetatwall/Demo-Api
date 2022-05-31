package com.example.demoapi.Objects

import com.example.demoapi.Interfaces.ApiCall
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl(URL.API).addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiCall : ApiCall by lazy {
        retrofit.create(ApiCall::class.java)
    }
}