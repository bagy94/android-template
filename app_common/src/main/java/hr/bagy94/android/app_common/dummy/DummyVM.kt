package hr.bagy94.android.app_common.dummy

import hr.bagy94.android.app_common.error.AppErrorHandler
import hr.bagy94.android.base.router.SingleEventRouter
import hr.bagy94.android.base.viewmodel.BaseVM

class DummyVM (errorHandler: AppErrorHandler): BaseVM<SingleEventRouter>(SingleEventRouter(),errorHandler)