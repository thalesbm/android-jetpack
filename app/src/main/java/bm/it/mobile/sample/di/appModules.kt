package bm.it.mobile.sample.di

import bm.it.mobile.sample.repository.IUserRepository
import bm.it.mobile.sample.repository.UserRepository
import bm.it.mobile.sample.viewModel.UserViewModel
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