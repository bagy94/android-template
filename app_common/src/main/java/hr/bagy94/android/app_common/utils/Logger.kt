package hr.bagy94.android.app_common.utils

import android.util.Log
import hr.bagy94.android.app_common.BuildConfig
import hr.bagy94.android.app_common.constants.TAG_DEBUG

fun logDebug(message:String, tag:String = TAG_DEBUG){
    if(BuildConfig.DEBUG){
        Log.d(tag,message)
    }
}