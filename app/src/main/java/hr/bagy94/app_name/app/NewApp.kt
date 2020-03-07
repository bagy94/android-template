package hr.bagy94.app_name.app

import hr.bagy94.android.app_common.app.KoinApp
import hr.bagy94.android.app_common.utils.logDebug
import hr.bagy94.android.base.localization.LocaleManager
import hr.bagy94.app_name.di.appModule
import org.koin.android.ext.android.inject
import org.koin.core.module.Module

class NewApp : KoinApp() {
    override val localeManager: LocaleManager by inject()
    override fun provideAppModules(): List<Module> = listOf(appModule)

    override fun onCreate() {
        logDebug("Application create")
        super.onCreate()
    }
}