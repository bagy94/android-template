package hr.bagy94.app_name.activity

import hr.bagy94.android.base.activity.BaseActivity
import hr.bagy94.android.base.localization.LocaleManager
import hr.bagy94.app_name.R
import org.koin.android.ext.android.inject

class MainActivity :  BaseActivity() {
    override val layoutId: Int  = R.layout.activity_main
    override val localeManager by inject<LocaleManager>()
}
