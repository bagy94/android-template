package hr.bagy94.android.app_common.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import hr.bagy94.android.app_common.BuildConfig
import hr.bagy94.android.base.const.DEFAULT_LOCALE
import hr.bagy94.android.base.const.EMPTY_STRING
import hr.bagy94.android.base.shared_pref.DefaultSharedPreference

interface AppSharedPreferences : DefaultSharedPreference {
    var authToken:String
}

class AppSharedPreferencesImpl(applicationContext: Context) : AppSharedPreferences{
    protected val defaultSharedPreference : SharedPreferences

    init {
        val key = applicationContext.packageName
        defaultSharedPreference = applicationContext.getSharedPreferences("$key$DEFAULT_SHARED_PREFERENCES", Context.MODE_PRIVATE)
        if(!defaultSharedPreference.contains(KEY_APP_VERSION)){
            defaultSharedPreference.edit().putString(KEY_APP_VERSION, BuildConfig.VERSION_NAME).apply()
        }
    }

    override var appVersion: String
        get() = defaultSharedPreference.getString(KEY_APP_VERSION, BuildConfig.VERSION_NAME)!!
        set(value) = editor {putString(KEY_APP_VERSION,value) }

    override var apiURL: String
        get() = defaultSharedPreference.getString(KEY_API_URL, EMPTY_STRING)!!
        set(value) = editor {  putString(KEY_API_URL,value) }

    override var appLocale: String
        get() = defaultSharedPreference.getString(KEY_APP_LOCALE, DEFAULT_LOCALE)!!
        set(value) = editor { putString(KEY_APP_LOCALE,value) }

    override var authToken: String
        get() = defaultSharedPreference.getString(KEY_AUTH_TOKEN, EMPTY_STRING)!!
        set(value) = editor { putString(KEY_AUTH_TOKEN,value) }

    protected fun editor(editor: SharedPreferences.Editor.()->Unit){
        defaultSharedPreference.edit().also(editor).apply()
    }


}


private const val DEFAULT_SHARED_PREFERENCES = ".SHARED_PREFERENCES"
private const val KEY_APP_VERSION = "KEY_APP_VERSION"
private const val KEY_API_URL = "KEY_API_URL"
private const val KEY_APP_LOCALE = "KEY_APP_LOCALE"
private const val KEY_AUTH_TOKEN = "KEY_AUTH_TOKEN"