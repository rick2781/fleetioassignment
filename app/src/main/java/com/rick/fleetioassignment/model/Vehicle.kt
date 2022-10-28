package com.rick.fleetioassignment.model

data class Vehicle(
    val id: Int,
    val name: String,
    val vin: String?,
    val make: String?,
    val model: String?,
    val imageUrl: String?
)