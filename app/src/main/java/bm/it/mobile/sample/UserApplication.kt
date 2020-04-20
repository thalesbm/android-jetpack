package bm.it.mobile.sample

import android.app.Application
import bm.it.mobile.sample.features.koin.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class UserApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@UserApplication)
            modules(appModules)
        }
    }
}
