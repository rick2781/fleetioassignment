package com.rick.fleetioassignment.ui.vehiclelist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rick.fleetioassignment.model.Vehicle
import com.rick.fleetioassignment.repository.VehicleRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class VehicleListViewModel(private val vehicleRepository: VehicleRepository): ViewModel() {

    private val _dealState: MutableStateFlow<List<Vehicle>> = MutableStateFlow(emptyList())
    val dealState: StateFlow<List<Vehicle>> = _dealState

    fun getVehicles() {
        viewModelScope.launch {
            _dealState.emit(vehicleRepository.getVehicles())
        }
    }
}