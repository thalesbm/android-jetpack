package bm.it.mobile.sample.features.retrofit.repository

import bm.it.mobile.sample.features.retrofit.CustomRetrofitCallback
import bm.it.mobile.sample.features.retrofit.GetDataService
import bm.it.mobile.sample.features.retrofit.RetrofitClientInstance
import bm.it.mobile.sample.features.retrofit.model.RestModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RestRepository {

    fun callRest(callback: CustomRetrofitCallback<RestModel>) {
        val service = RetrofitClientInstance.getRetrofitInstance()?.create(GetDataService::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            val response= service!!.getUser()
            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    response.body().let {
                        callback.success(response.body()!!)
                    }
                } else {
                    callback.error()
                }
            }
        }
    }
}