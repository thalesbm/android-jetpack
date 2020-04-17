package bm.it.mobile.sample.koin.repository

import bm.it.mobile.sample.koin.model.UserModel

interface IUserRepository {

    fun fetchUser(model: UserModel): List<UserModel>

}