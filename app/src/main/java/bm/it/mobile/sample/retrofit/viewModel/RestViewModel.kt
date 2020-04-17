package bm.it.mobile.sample.retrofit.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bm.it.mobile.sample.retrofit.CustomRetrofitCallback
import bm.it.mobile.sample.retrofit.model.RestModel
import bm.it.mobile.sample.retrofit.repository.RestRepository

class RestViewModel(private val repository: RestRepository) : ViewModel() {

    private val observable: MutableLiveData<RestModel> by lazy {
        MutableLiveData<RestModel>()
    }

    fun getCustomObservable(): MutableLiveData<RestModel> {
        return observable
    }

    private val observableString: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun getCustomStringObservable(): MutableLiveData<String> {
        return observableString
    }

    fun callRepository() {
        repository.callRest(object : CustomRetrofitCallback<RestModel>{
            override fun success(t: RestModel) {
                observable.value = t
            }

            override fun error() {
                observableString.value = "error"
            }
        })
    }
}
