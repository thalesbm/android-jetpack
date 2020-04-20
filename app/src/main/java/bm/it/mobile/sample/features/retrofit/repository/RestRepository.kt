package bm.it.mobile.sample.features.retrofit.repository

import bm.it.mobile.sample.features.retrofit.CustomRetrofitCallback
import bm.it.mobile.sample.features.retrofit.GetDataService
import bm.it.mobile.sample.features.retrofit.RetrofitClientInstance
import bm.it.mobile.sample.features.retrofit.model.RestModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestRepository {

    fun callRest(callback: CustomRetrofitCallback<RestModel>) {
        val service: GetDataService? =
            RetrofitClientInstance.getRetrofitInstance()?.create(GetDataService::class.java)
        val call: Call<RestModel>? = service?.getUser()

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