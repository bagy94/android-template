package hr.bagy94.android.app_common.error

import hr.bagy94.android.base.error.NetworkErrorHandler

interface AppErrorHandler : NetworkErrorHandler<Any> {
    //TODO: Add additional method for parsing errors
}