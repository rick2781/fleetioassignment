package com.rick.fleetioassignment.api

import com.rick.fleetioassignment.model.VehicleResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

internal const val BASE_URL = "https://secure.fleetio.com/api/v1/"

interface VehicleAPIService {

    @GET("vehicles")
    suspend fun getVehicles(
        @Header("Authorization") authorizationToken: String = AUTH_TOKEN,
        @Header("Account-Token") accountToken: String = ACC_TOKEN,
        @Query("page") page: String
    ): Response<VehicleResponse>

    private companion object {

        /**
         * Definitely wouldn't store the authentication token like this. Just doing that way for simplicity
         */

        const val AUTH_TOKEN = "Token token=a3ddc620b35b609682192c167de1b1f3f5100387"

        const val ACC_TOKEN = "798819214b"
    }
}