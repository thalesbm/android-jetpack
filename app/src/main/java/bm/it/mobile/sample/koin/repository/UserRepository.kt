package bm.it.mobile.sample.koin.repository

import bm.it.mobile.sample.koin.model.UserModel
import java.util.*

class UserRepository: IUserRepository {

    private var list = mutableListOf<UserModel>()

    override fun fetchUser(model: UserModel): List<UserModel> {
        model.name = model.name.toUpperCase(Locale.US)
        list.add(model)
        return list
    }
}
