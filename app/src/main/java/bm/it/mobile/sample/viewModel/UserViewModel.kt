package bm.it.mobile.sample.viewModel

import androidx.lifecycle.MutableLiveData
import bm.it.mobile.sample.model.UserModel
import bm.it.mobile.sample.repository.UserRepository

class UserViewModel(private val repository: UserRepository) {

    private val modelObservable: MutableLiveData<List<UserModel>> by lazy {
        MutableLiveData<List<UserModel>>()
    }

    fun getModelUpperCase(): MutableLiveData<List<UserModel>> {
        return modelObservable
    }

    fun validate(name: String) {
        if (name.isNotEmpty()) {
            val model = UserModel(name)
            val list = repository.fetchUser(model)
            modelObservable.value = mutableListOf(list)
        }
    }
}