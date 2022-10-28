package com.rick.fleetioassignment.model


import com.google.gson.annotations.SerializedName

data class CustomFields(
    @SerializedName("telematics_subscription")
    val telematicsSubscription: String = "",
    @SerializedName("warranty_expiration")
    val warrantyExpiration: String = ""
)