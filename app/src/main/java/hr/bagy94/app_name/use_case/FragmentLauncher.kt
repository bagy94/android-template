package hr.bagy94.app_name.use_case

import hr.bagy94.android.app_common.dummy.DummyVM
import hr.bagy94.android.app_common.fragment.BaseAppFragment
import hr.bagy94.android.app_common.utils.logDebug
import hr.bagy94.android.base.router.SingleEventRouter
import hr.bagy94.app_name.R
import hr.bagy94.app_name.databinding.FragmentLauncherBinding
import org.koin.android.viewmodel.ext.android.viewModel

class LauncherFragment : BaseAppFragment<SingleEventRouter, DummyVM, FragmentLauncherBinding>(){
    override val layoutId = R.layout.fragment_launcher
    override val viewModel by viewModel<DummyVM>()

    override fun back() {
        logDebug("Launcher fragment action: back()")
    }

    override fun hideLoader() {
        logDebug("Launcher fragment action: hideLoader()")
    }

    override fun showLoader() {
        logDebug("Launcher fragment action: showLoader()")
    }
}