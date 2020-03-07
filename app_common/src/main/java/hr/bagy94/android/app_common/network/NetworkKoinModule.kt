package hr.bagy94.android.app_common.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import hr.bagy94.android.app_common.BuildConfig
import hr.bagy94.android.app_common.sharedpreferences.AppSharedPreferences
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkKoinModule = module {
    single { provideRetrofit(get())}
    single<Gson> { GsonBuilder().create() }
}


internal fun provideRetrofit(sharedPreference: AppSharedPreferences)=
    Retrofit.Builder()
        .baseUrl(sharedPreference.apiURL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(provideClient(sharedPreference))
        .build()

internal fun provideClient(sharedPreference: AppSharedPreferences):OkHttpClient{
    val client = OkHttpClient.Builder()
    client.addInterceptor(HeaderInterceptor(sharedPreference))
    if(BuildConfig.DEBUG){
        client.addInterceptor(HttpLoggingInterceptor())
    }
    return client.build()
}
