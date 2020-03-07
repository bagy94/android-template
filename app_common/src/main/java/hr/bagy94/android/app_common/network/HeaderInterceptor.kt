package hr.bagy94.android.app_common.network

import hr.bagy94.android.app_common.sharedpreferences.AppSharedPreferences
import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor (private val sharedPrefRepo:AppSharedPreferences): Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response =
        chain.proceed(chain.request()
            .newBuilder()
            .addHeader("Accept-Language", sharedPrefRepo.appLocale)
            .addHeader("Authorization", "Bearer ${sharedPrefRepo.authToken}")
            .build()
        )
}