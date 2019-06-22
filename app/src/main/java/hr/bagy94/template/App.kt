package hr.bagy94.template

import hr.bagy94.base_android.BaseApp
import hr.bagy94.template.dummy.dummyModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(dummyModule)
        }
    }
}