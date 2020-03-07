package hr.bagy94.android.app_common

import hr.bagy94.android.app_common.sharedpreferences.AppSharedPreferences
import hr.bagy94.android.app_common.sharedpreferences.AppSharedPreferencesImpl
import hr.bagy94.android.base.localization.LocaleManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val commonKoinModule = module {
    single <AppSharedPreferences> { AppSharedPreferencesImpl(androidContext()) }
    single { LocaleManager(get()) }
}