package hr.bagy94.template.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import hr.bagy94.android.common.error.AppErrorHandler
import hr.bagy94.android.common.sharedpref.AppSharedPreference
import hr.bagy94.template.error.AppErrorHandlerImpl
import hr.bagy94.template.sharedpref.AppSharedPreferencesImpl
import org.koin.dsl.module

val appModule = module {
    single<Gson> { GsonBuilder().create() }
    single<AppSharedPreference> { AppSharedPreferencesImpl(get(), get()) }
    single<AppErrorHandler> { AppErrorHandlerImpl() }
}