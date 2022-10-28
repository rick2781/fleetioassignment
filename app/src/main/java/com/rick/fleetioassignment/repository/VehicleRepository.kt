package com.rick.fleetioassignment.repository

import com.rick.fleetioassignment.api.VehicleAPIService
import com.rick.fleetioassignment.model.Vehicle

class VehicleRepository(private val vehicleAPIService: VehicleAPIService) {

    suspend fun getVehicles(): List<Vehicle> =
        vehicleAPIService.getVehicles(AUTH_TOKEN, ACC_TOKEN).map { it.toDomainData() }

    private companion object {

        /**
         * Definitely wouldn't store the authentication token like this. Just doing that way for the sake of simplicity
         */

        const val AUTH_TOKEN = "Token token=a3ddc620b35b609682192c167de1b1f3f5100387"

        const val ACC_TOKEN = "798819214b"
    }
}