package bm.it.mobile.sample.courotines.viewModel

import androidx.lifecycle.MutableLiveData
import bm.it.mobile.sample.courotines.repository.CoroutinesRepository

class CoroutinesViewModel(private val repository: CoroutinesRepository) {

    private val observable: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun getCustomObservable() : MutableLiveData<Int> {
        return observable
    }

    fun count() {
        val number = repository.getNumber()
        observable.value = number
    }
}