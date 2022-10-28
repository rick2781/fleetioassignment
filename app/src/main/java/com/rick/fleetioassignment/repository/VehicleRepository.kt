package com.rick.fleetioassignment.repository

import com.rick.fleetioassignment.api.VehicleAPIService
import com.rick.fleetioassignment.model.DataState
import com.rick.fleetioassignment.model.Vehicle

class VehicleRepository(private val vehicleAPIService: VehicleAPIService) {

    suspend fun getVehicles(page: String): DataState<List<Vehicle>> =
        try {
            val vehicles = vehicleAPIService.getVehicles(page = page)

            if (vehicles.isSuccessful) {
                DataState.Success(
                    vehicles.body()!!.map { it.toDomainData() },
                    vehicles.headers().get(PAGINATION_KEY)
                )
            } else DataState.Error(vehicles.errorBody().toString())

        } catch (e: Exception) {
            DataState.Error(e.message.toString())
        }

    private companion object {
        const val PAGINATION_KEY = "x-pagination-current-page"
    }
}