package com.rick.fleetioassignment

import android.app.Application
import com.rick.fleetioassignment.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class FleetioApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@FleetioApp)
            modules(
                appModule
            )
        }
    }
}