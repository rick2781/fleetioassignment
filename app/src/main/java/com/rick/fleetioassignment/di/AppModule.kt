package com.rick.fleetioassignment.di

import com.rick.fleetioassignment.api.VehicleAPIClient
import com.rick.fleetioassignment.repository.VehicleRepository
import com.rick.fleetioassignment.ui.vehiclelist.VehicleItemAdapter
import com.rick.fleetioassignment.ui.vehiclelist.VehicleListViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { VehicleAPIClient.provideApi() }

    single { VehicleRepository(get()) }

    factory { VehicleItemAdapter(androidContext()) }

    viewModel { VehicleListViewModel(get()) }
}