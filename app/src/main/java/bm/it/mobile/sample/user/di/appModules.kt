package bm.it.mobile.sample.user.di

import bm.it.mobile.sample.user.repository.IUserRepository
import bm.it.mobile.sample.user.repository.UserRepository
import bm.it.mobile.sample.user.viewModel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModules = module {

    viewModel {
        UserViewModel(get())
    }

    single {
        UserRepository() as IUserRepository
    }
}