package com.p4r4d0x.edmclassifier.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class EDMClassifierApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidContext(this@EDMClassifierApplication)
            modules(
                listOf(
                    appModule,
                    networkingModule,
                    viewModelModule,
                    useCaseModule,
                    dataSourcesModule,
                    repositoriesModule
                )
            )
        }
    }
}