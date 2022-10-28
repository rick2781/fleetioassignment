package com.rick.fleetioassignment.model


import com.google.gson.annotations.SerializedName

data class ExternalIds(
    @SerializedName("fuel_id")
    val fuelId: String = "",
    @SerializedName("task_code")
    val taskCode: Any? = Any()
)