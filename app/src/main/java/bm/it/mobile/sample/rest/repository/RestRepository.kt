package bm.it.mobile.sample.rest.repository

import bm.it.mobile.sample.rest.CustomRetrofitCallback
import bm.it.mobile.sample.rest.GetDataService
import bm.it.mobile.sample.rest.RetrofitClientInstance
import bm.it.mobile.sample.rest.model.RestModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestRepository {

    fun callRest(callback: CustomRetrofitCallback<RestModel>) {
        val service: GetDataService? =
            RetrofitClientInstance.getRetrofitInstance()?.create(GetDataService::class.java)
        val call: Call<RestModel>? = service?.getAllPhotos()

        call?.enqueue(object : Callback<RestModel> {
            override fun onResponse(
                call: Call<RestModel>,
                response: Response<RestModel>
            ) {
                callback.success(response.body()!!)
            }

            override fun onFailure(call: Call<RestModel>, t: Throwable) {
                callback.error()
            }
        })
    }
}