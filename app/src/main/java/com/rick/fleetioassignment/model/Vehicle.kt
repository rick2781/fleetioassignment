package com.rick.fleetioassignment.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Vehicle(
    val id: Int,
    val name: String,
    val vin: String?,
    val make: String?,
    val model: String?,
    val imageUrl: String?
): Parcelable