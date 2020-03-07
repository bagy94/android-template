package hr.bagy94.android.app_common.app

import hr.bagy94.android.app_common.commonKoinModule
import hr.bagy94.android.app_common.network.networkKoinModule
import hr.bagy94.android.base.app.BaseApp
import org.koin.core.module.Module

abstract class KoinApp :BaseApp(){

    protected abstract fun provideAppModules():List<Module>

    override fun provideKoinModules(): List<Module> =
        mutableListOf(commonKoinModule, networkKoinModule)
            .apply { addAll(provideAppModules()) }
}