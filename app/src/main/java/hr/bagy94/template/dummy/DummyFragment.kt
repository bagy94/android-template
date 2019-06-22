package hr.bagy94.template.dummy

import hr.bagy94.base_android.fragment.BaseFragment
import hr.bagy94.template.R
import hr.bagy94.template.databinding.FragmentDummyBinding
import org.koin.android.viewmodel.ext.android.viewModel

class DummyFragment : BaseFragment<DummyViewModel, FragmentDummyBinding>() {
    override val mViewId: Int = R.layout.fragment_dummy
    override val mViewModel: DummyViewModel by viewModel()
}