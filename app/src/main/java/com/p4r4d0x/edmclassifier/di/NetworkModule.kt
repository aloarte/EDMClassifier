package com.p4r4d0x.edmclassifier.di

import org.koin.dsl.module

class NetworkModule {

    val networkingModule = module {
//        single { GsonConverterFactory.create() as Converter.Factory }
//        single { HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY) as Interceptor }
//        single {
//            OkHttpClient.Builder().apply {
//                if (BuildConfig.DEBUG) addInterceptor(get())
//                    .callTimeout(10, TimeUnit.SECONDS)
//            }.build()
//        }
//        single {
//            Retrofit.Builder()
//                .baseUrl(BuildConfig.HOST)
//                .client(get())
//                .addConverterFactory(get())
//                .build()
//        }
//        single { get<Retrofit>().create(LoginService::class.java) }
//        single { get<Retrofit>().create(BlockService::class.java) }
//        single { get<Retrofit>().create(ForgotPasswordService::class.java) }
    }
}