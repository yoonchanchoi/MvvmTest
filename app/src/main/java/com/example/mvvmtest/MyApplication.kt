package com.example.mvvmtest

import androidx.multidex.MultiDexApplication
import com.example.mvvmtest.common.myDiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(myDiModule)
        }
    }
}