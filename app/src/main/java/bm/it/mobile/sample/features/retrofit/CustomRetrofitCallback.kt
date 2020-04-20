package bm.it.mobile.sample.features.retrofit

interface CustomRetrofitCallback<T> {

    fun success(t: T)

    fun error()
}