package com.rick.fleetioassignment.model

sealed class DataState<T> {

    data class Success<T>(val body: T, val currentPageIndex: String? = null): DataState<T>()
    data class Error<T>(val errorMessage: String): DataState<T>()
    object Loading: DataState<Nothing>()
}