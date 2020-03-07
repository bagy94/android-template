package hr.bagy94.app_name.error

import com.google.gson.Gson
import hr.bagy94.android.app_common.error.AppErrorHandler

internal class NewAppErrorHandler (mGson: Gson):
    AppErrorHandler {
    override val gson: Gson = mGson
}

