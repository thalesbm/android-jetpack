package bm.it.mobile.sample.rest.repository

import android.util.Log
import bm.it.mobile.sample.rest.GetDataService
import bm.it.mobile.sample.rest.RetrofitClientInstance
import bm.it.mobile.sample.rest.model.RestModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestRepository {

    fun callRest() {
        val service: GetDataService? =
            RetrofitClientInstance.getRetrofitInstance()?.create(GetDataService::class.java)
        val call: Call<RestModel>? = service?.getAllPhotos()

        call?.enqueue(object : Callback<RestModel> {
            override fun onResponse(
                call: Call<RestModel>,
                response: Response<RestModel>
            ) {
                Log.e("THALES", "success")
            }

            override fun onFailure(call: Call<RestModel>, t: Throwable) {
                Log.e("THALES", "failure")
            }
        })
    }
}