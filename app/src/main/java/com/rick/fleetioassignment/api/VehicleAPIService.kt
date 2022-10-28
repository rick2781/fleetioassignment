package com.rick.fleetioassignment.api

import com.rick.fleetioassignment.model.VehicleResponse
import retrofit2.http.GET
import retrofit2.http.Header

internal const val BASE_URL = "https://secure.fleetio.com/api/v1/"

interface VehicleAPIService {

    @GET("vehicles")
    suspend fun getVehicles(
        @Header("Authorization") authorizationToken: String,
        @Header("Account-Token") accountToken: String
    ): VehicleResponse
}