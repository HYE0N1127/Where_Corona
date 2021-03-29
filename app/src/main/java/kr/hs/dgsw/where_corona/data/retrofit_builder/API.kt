package kr.hs.dgsw.where_corona.data.retrofit_builder

import io.reactivex.Single
import kr.hs.dgsw.where_corona.data.model.response_model.CoronaInfo
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET(".")
    fun getCoronaInfo(@Query("serviceKey")serviceKey: String): Single<CoronaInfo>
}