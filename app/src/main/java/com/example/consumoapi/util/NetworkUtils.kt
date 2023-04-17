package com.example.consumoapi.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    companion object {
        fun getRetrofitInstance(path: String) : Retrofit{

                    //retorna um retrofit
            return Retrofit.Builder()

                    //baseurl é a url da api
                .baseUrl(path)

                    //converte para gson
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}