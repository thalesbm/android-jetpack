package bm.it.mobile.sample.repository

import bm.it.mobile.sample.model.UserModel
import java.util.*

class UserRepository: IUserRepository {

    private var list = mutableListOf<UserModel>()

    override fun fetchUser(model: UserModel): List<UserModel> {
        model.name = model.name.toUpperCase(Locale.US)
        list.add(model)
        return list
    }
}
