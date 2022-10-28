package com.rick.fleetioassignment.ui.vehiclelist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.rick.fleetioassignment.api.VehiclePagingSource
import com.rick.fleetioassignment.model.DataState
import com.rick.fleetioassignment.model.Vehicle
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class VehicleListViewModel(private val vehiclePagingSource: VehiclePagingSource) : ViewModel() {

    fun getVehiclesPaged(): Flow<PagingData<Vehicle>> =
        Pager(config = PagingConfig(pageSize = 100)) {
            vehiclePagingSource
        }.flow.cachedIn(viewModelScope)
}