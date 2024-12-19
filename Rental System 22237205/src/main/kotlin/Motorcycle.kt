package com.example.vehicle

import Vehicle

class Motorcycle(
    vehicleId: String,
    model: String,
    baseRentalRate: Double,
    private val hasSidecar: Boolean
) : Vehicle(vehicleId, model, baseRentalRate) {

    override fun calculateRentalCost(days: Int): Double {
        return if (hasSidecar) getBaseRentalRate() * 1.2 * days else getBaseRentalRate() * days
    }

    override fun isAvailableForRental(): Boolean {
        return isAvailable()
    }

    override fun toString(): String {
        return "Motorcycle(model='${getModel()}', sidecar=$hasSidecar)"
    }
}