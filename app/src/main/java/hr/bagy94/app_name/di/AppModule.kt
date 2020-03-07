package hr.bagy94.app_name.di

import hr.bagy94.android.app_common.dummy.DummyVM
import hr.bagy94.android.app_common.error.AppErrorHandler
import hr.bagy94.app_name.error.NewAppErrorHandler
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory<AppErrorHandler> { NewAppErrorHandler(get()) }
    viewModel { DummyVM(get()) }
}