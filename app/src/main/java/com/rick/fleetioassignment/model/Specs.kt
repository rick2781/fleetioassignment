package com.rick.fleetioassignment.model


import com.google.gson.annotations.SerializedName

data class Specs(
    @SerializedName("account_id")
    val accountId: Int = 0,
    @SerializedName("base_towing_capacity")
    val baseTowingCapacity: Double = 0.0,
    @SerializedName("bed_length")
    val bedLength: Any? = Any(),
    @SerializedName("body_subtype")
    val bodySubtype: String = "",
    @SerializedName("body_type")
    val bodyType: String = "",
    @SerializedName("brake_system")
    val brakeSystem: String = "",
    @SerializedName("cargo_volume")
    val cargoVolume: Double = 0.0,
    @SerializedName("created_at")
    val createdAt: String = "",
    @SerializedName("curb_weight")
    val curbWeight: Double = 0.0,
    @SerializedName("drive_type")
    val driveType: String = "",
    @SerializedName("duty_type")
    val dutyType: Any? = Any(),
    @SerializedName("engine_aspiration")
    val engineAspiration: String = "",
    @SerializedName("engine_block_type")
    val engineBlockType: String = "",
    @SerializedName("engine_bore")
    val engineBore: Double = 0.0,
    @SerializedName("engine_bore_with_units")
    val engineBoreWithUnits: String = "",
    @SerializedName("engine_brand")
    val engineBrand: String = "",
    @SerializedName("engine_cam_type")
    val engineCamType: String = "",
    @SerializedName("engine_compression")
    val engineCompression: Double = 0.0,
    @SerializedName("engine_cylinders")
    val engineCylinders: Int = 0,
    @SerializedName("engine_description")
    val engineDescription: String = "",
    @SerializedName("engine_displacement")
    val engineDisplacement: Double = 0.0,
    @SerializedName("engine_stroke")
    val engineStroke: Double = 0.0,
    @SerializedName("engine_valves")
    val engineValves: Int = 0,
    @SerializedName("epa_city")
    val epaCity: Double = 0.0,
    @SerializedName("epa_combined")
    val epaCombined: Double = 0.0,
    @SerializedName("epa_highway")
    val epaHighway: Double = 0.0,
    @SerializedName("front_tire_psi")
    val frontTirePsi: Any? = Any(),
    @SerializedName("front_tire_type")
    val frontTireType: String = "",
    @SerializedName("front_track_width")
    val frontTrackWidth: Double = 0.0,
    @SerializedName("front_wheel_diameter")
    val frontWheelDiameter: String = "",
    @SerializedName("fuel_induction")
    val fuelInduction: String = "",
    @SerializedName("fuel_quality")
    val fuelQuality: String = "",
    @SerializedName("fuel_tank_2_capacity")
    val fuelTank2Capacity: Any? = Any(),
    @SerializedName("fuel_tank_capacity")
    val fuelTankCapacity: Double = 0.0,
    @SerializedName("gross_vehicle_weight_rating")
    val grossVehicleWeightRating: Double = 0.0,
    @SerializedName("ground_clearance")
    val groundClearance: Double = 0.0,
    @SerializedName("height")
    val height: Double = 0.0,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("interior_volume")
    val interiorVolume: Any? = Any(),
    @SerializedName("length")
    val length: Double = 0.0,
    @SerializedName("max_hp")
    val maxHp: Int = 0,
    @SerializedName("max_payload")
    val maxPayload: Double = 0.0,
    @SerializedName("max_torque")
    val maxTorque: Int = 0,
    @SerializedName("msrp")
    val msrp: Double = 0.0,
    @SerializedName("msrp_cents")
    val msrpCents: Int = 0,
    @SerializedName("oil_capacity")
    val oilCapacity: Double = 0.0,
    @SerializedName("passenger_volume")
    val passengerVolume: String = "",
    @SerializedName("rear_axle_type")
    val rearAxleType: String = "",
    @SerializedName("rear_tire_psi")
    val rearTirePsi: Any? = Any(),
    @SerializedName("rear_tire_type")
    val rearTireType: String = "",
    @SerializedName("rear_track_width")
    val rearTrackWidth: Double = 0.0,
    @SerializedName("rear_wheel_diameter")
    val rearWheelDiameter: String = "",
    @SerializedName("redline_rpm")
    val redlineRpm: String = "",
    @SerializedName("transmission_brand")
    val transmissionBrand: String = "",
    @SerializedName("transmission_description")
    val transmissionDescription: String = "",
    @SerializedName("transmission_gears")
    val transmissionGears: Int = 0,
    @SerializedName("transmission_type")
    val transmissionType: String = "",
    @SerializedName("updated_at")
    val updatedAt: String = "",
    @SerializedName("vehicle_id")
    val vehicleId: Int = 0,
    @SerializedName("weight_class")
    val weightClass: Any? = Any(),
    @SerializedName("wheelbase")
    val wheelbase: Double = 0.0,
    @SerializedName("wheelbase_with_units")
    val wheelbaseWithUnits: String = "",
    @SerializedName("width")
    val width: Double = 0.0
)