package bm.it.mobile.sample.repository

import bm.it.mobile.sample.model.UserModel
import java.util.*

class UserRepository: IUserRepository {

    override fun fetchUser(model: UserModel): UserModel {
        model.name = model.name.toUpperCase(Locale.US)
        return model
    }
}
