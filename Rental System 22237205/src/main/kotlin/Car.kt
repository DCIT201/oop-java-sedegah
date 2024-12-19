package com.example.vehicle

import Vehicle

class Car(
    vehicleId: String,
    model: String,
    baseRentalRate: Double,
    private val passengerCapacity: Int
) : Vehicle(vehicleId, model, baseRentalRate) {

    override fun calculateRentalCost(days: Int): Double {
        return getBaseRentalRate() * days
    }

    override fun isAvailableForRental(): Boolean {
        return isAvailable()
    }

    override fun toString(): String {
        return "Car(model='${getModel()}', capacity=$passengerCapacity)"
    }
}