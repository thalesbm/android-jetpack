package bm.it.mobile.sample.user.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bm.it.mobile.sample.user.model.UserModel
import bm.it.mobile.sample.user.repository.IUserRepository

class UserViewModel(private val repository: IUserRepository): ViewModel() {

    private val modelObservable: MutableLiveData<List<UserModel>> by lazy {
        MutableLiveData<List<UserModel>>()
    }

    fun getModelUpperCase(): MutableLiveData<List<UserModel>> {
        return modelObservable
    }

    fun validate(name: String) {
        if (name.isNotEmpty()) {
            val model = UserModel(name)
            modelObservable.value = repository.fetchUser(model)
        }
    }
}