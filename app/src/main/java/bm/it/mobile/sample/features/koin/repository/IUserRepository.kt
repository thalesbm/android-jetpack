package bm.it.mobile.sample.features.koin.repository

import bm.it.mobile.sample.features.koin.model.UserModel

interface IUserRepository {

    fun fetchUser(model: UserModel): List<UserModel>

}