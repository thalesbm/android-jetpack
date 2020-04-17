package bm.it.mobile.sample.retrofit

interface CustomRetrofitCallback<T> {

    fun success(t: T)

    fun error()
}