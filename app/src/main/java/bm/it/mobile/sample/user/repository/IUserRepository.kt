package bm.it.mobile.sample.user.repository

import bm.it.mobile.sample.user.model.UserModel

interface IUserRepository {

    fun fetchUser(model: UserModel): List<UserModel>

}