package bm.it.mobile.sample.rest

import bm.it.mobile.sample.rest.model.RestModel
import retrofit2.Call
import retrofit2.http.GET

interface GetDataService {

    @GET("/api/users/3")
    fun getAllPhotos(): Call<RestModel>
}