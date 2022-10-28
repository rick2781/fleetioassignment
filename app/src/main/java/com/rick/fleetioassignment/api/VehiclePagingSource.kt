package com.rick.fleetioassignment.api

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.rick.fleetioassignment.model.DataState
import com.rick.fleetioassignment.model.Vehicle
import com.rick.fleetioassignment.repository.VehicleRepository

class VehiclePagingSource(
    private val vehicleRepository: VehicleRepository
) : PagingSource<Int, Vehicle>() {
    override suspend fun load(
        params: LoadParams<Int>
    ): LoadResult<Int, Vehicle> = try {
        val nextPageNumber = params.key ?: 1
        val response = (vehicleRepository.getVehicles(nextPageNumber.toString()) as DataState.Success)
        LoadResult.Page(
            data = response.body,
            prevKey = null,
            nextKey = (response.currentPageIndex?.toInt()?: 0) + 1
        )
    } catch (e: Exception) {
        LoadResult.Error(e)
    }


    override fun getRefreshKey(state: PagingState<Int, Vehicle>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}