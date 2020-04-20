package bm.it.mobile.sample.retrofit

import bm.it.mobile.sample.retrofit.model.RestModel
import retrofit2.Call
import retrofit2.http.GET

interface GetDataService {

    @GET("/api/users/3")
    fun getUser(): Call<RestModel>
}