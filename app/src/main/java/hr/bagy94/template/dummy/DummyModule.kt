package hr.bagy94.template.dummy

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dummyModule = module {
    viewModel { DummyViewModel() }
}