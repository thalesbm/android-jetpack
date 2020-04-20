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
        for (x in 0..5) {
            val number = repository.getNumber(x)
            observable.value = number
        }
    }
}