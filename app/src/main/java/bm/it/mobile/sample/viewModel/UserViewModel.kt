package bm.it.mobile.sample.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import bm.it.mobile.sample.model.UserModel
import bm.it.mobile.sample.repository.UserRepository

class UserViewModel(private val repository: UserRepository): ViewModel() {

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

//    class UserViewModelProvider(private val repository: UserRepository): ViewModelProvider.Factory {
//        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//            return UserViewModel(repository) as T
//        }
//    }
}