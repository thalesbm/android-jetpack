package bm.it.mobile.sample.viewModel

import bm.it.mobile.sample.model.UserModel
import bm.it.mobile.sample.repository.UserRepository

class UserViewModel(private val repository: UserRepository) {

    fun validate(name: String) {
        if (name.isNotEmpty()) {
            val model = UserModel(name)
            repository.fetchUser(model)
        }
    }
}