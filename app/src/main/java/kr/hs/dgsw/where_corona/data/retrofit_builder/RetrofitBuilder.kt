package kr.hs.dgsw.where_corona.data.retrofit_builder

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    var api : API

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.corona-19.kr/korea/?serviceKey=APIKey")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(API::class.java)
    }
}