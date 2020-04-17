package bm.it.mobile.sample.rest.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import bm.it.mobile.sample.R
import bm.it.mobile.sample.rest.GetDataService
import bm.it.mobile.sample.rest.RetrofitClientInstance
import bm.it.mobile.sample.rest.model.RestModel
import kotlinx.android.synthetic.main.activity_rest.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest)

        button3.setOnClickListener {

        }
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
        });
    }


}