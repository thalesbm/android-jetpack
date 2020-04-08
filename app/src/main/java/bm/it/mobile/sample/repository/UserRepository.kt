package bm.it.mobile.sample.repository

import bm.it.mobile.sample.model.UserModel

class UserRepository: IUserRepository {
    override fun fetchUser(model: UserModel) {
        model.name.toUpperCase()
    }
}