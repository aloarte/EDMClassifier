package com.p4r4d0x.edmclassifier.di

import com.p4r4d0x.edmclassifier.HistoryViewModel
import com.p4r4d0x.edmclassifier.ProfileInfoDataSource
import com.p4r4d0x.edmclassifierdata.repositories.ClassifySongRepository
import com.p4r4d0x.edmclassifierdata.repositories.ProfileInfoRepository
import com.p4r4d0x.edmclassifierdata.repositories.ProfileInfoSource
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

@JvmField
val appModule = module {
    // single instance of HelloRepository
    single<ProfileInfoRepository> { ProfileInfoRepository(get()) }
    single<ClassifySongRepository> { ClassifySongRepository(get()) }

    single<ProfileInfoSource> { (ProfileInfoDataSource()) }

    // MyViewModel ViewModel
    viewModel { HistoryViewModel(get()) }
}