package bm.it.mobile.sample.features.courotines.viewModel

import androidx.lifecycle.MutableLiveData
import bm.it.mobile.sample.features.courotines.repository.CoroutinesRepository

class CoroutinesViewModel(private val repository: CoroutinesRepository) {

    private val observable: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun getCustomObservable() : MutableLiveData<Int> {
        return observable
    }

    suspend fun count() {
        for (x in 0..5) {
            val number = repository.getNumber(x)
            observable.postValue(number)
        }
    }
}