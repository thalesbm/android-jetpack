package bm.it.mobile.sample.features.koin.di

import bm.it.mobile.sample.features.koin.repository.IUserRepository
import bm.it.mobile.sample.features.koin.repository.UserRepository
import bm.it.mobile.sample.features.koin.viewModel.UserViewModel
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