package bm.it.mobile.sample.features.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientInstance {

    companion object {

        private var retrofit: Retrofit? = null
        private val BASE_URL = "https://reqres.in"

        fun getRetrofitInstance(): Retrofit? {
            if (retrofit == null) {
                return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
    }
}