package hr.bagy94.android.app_common.fragment

import androidx.databinding.ViewDataBinding
import hr.bagy94.android.base.fragment.BaseFragment
import hr.bagy94.android.base.router.BaseRouter
import hr.bagy94.android.base.viewmodel.BaseVM

abstract class BaseAppFragment <ROUTER:BaseRouter, VM:BaseVM<ROUTER>, VB:ViewDataBinding> : BaseFragment<ROUTER,VM,VB>(){

}
