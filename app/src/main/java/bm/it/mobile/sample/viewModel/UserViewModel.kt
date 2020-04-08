package bm.it.mobile.sample.viewModel

import androidx.lifecycle.MutableLiveData
import bm.it.mobile.sample.model.UserModel
import bm.it.mobile.sample.repository.UserRepository

class UserViewModel(private val repository: UserRepository) {

    private val modelObservable: MutableLiveData<UserModel> by lazy {
        MutableLiveData<UserModel>()
    }

    fun getModelUpperCase(): MutableLiveData<UserModel> {
        return modelObservable
    }

    fun validate(name: String) {
        if (name.isNotEmpty()) {
            val model = UserModel(name)
            modelObservable.value = repository.fetchUser(model)
        }
    }
}