package com.p4r4d0x.edmclassifier.di

import com.p4r4d0x.edmclassifier.HistoryViewModel
import com.p4r4d0x.edmclassifier.ProfileInfoDataSource
import com.p4r4d0x.edmclassifierdata.repositories.ClassifySongRepository
import com.p4r4d0x.edmclassifierdata.repositories.ProfileInfoRepository
import com.p4r4d0x.edmclassifierdata.sources.ProfileInfoSource
import com.p4r4d0x.edmclassifierdata.usecases.ProfileInfoUseCase
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

@JvmField
val appModule = module {


}
val viewModelModule = module {
    viewModel { HistoryViewModel(get()) }
}
val dataSourcesModule = module {
    factory<ProfileInfoSource> { (ProfileInfoDataSource()) }
}

val useCaseModule = module {
    factory { ProfileInfoUseCase(get()) }
}

val repositoriesModule = module {
    factory { ProfileInfoRepository(get()) }
    factory { ClassifySongRepository(get()) }
}

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
