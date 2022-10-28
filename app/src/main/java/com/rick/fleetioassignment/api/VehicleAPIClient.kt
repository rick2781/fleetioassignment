package com.rick.fleetioassignment.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object VehicleAPIClient {

    fun provideApi(): VehicleAPIService =

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(VehicleAPIService::class.java)
}