package bm.it.mobile.sample.rest

interface CustomRetrofitCallback<T> {

    fun success(t: T)

    fun error()
}