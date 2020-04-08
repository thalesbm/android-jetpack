package bm.it.mobile.sample.repository

import bm.it.mobile.sample.model.UserModel

interface IUserRepository {

    fun fetchUser(model: UserModel): List<UserModel>

}