package bm.it.mobile.sample.courotines.viewModel

import androidx.lifecycle.MutableLiveData
import bm.it.mobile.sample.courotines.repository.CoroutinesRepository

class CoroutinesViewModel(private val repository: CoroutinesRepository) {

    private val observable: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun getCustomObservable() : MutableLiveData<String> {
        return observable
    }

    fun count() {

    }
}