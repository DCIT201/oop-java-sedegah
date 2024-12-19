import Vehicle

class Truck(
    vehicleId: String,
    model: String,
    baseRentalRate: Double,
    private val maxLoadCapacity: Double
) : Vehicle(vehicleId, model, baseRentalRate) {

    override fun calculateRentalCost(days: Int): Double {
        return getBaseRentalRate() * 1.5 * days
    }

    override fun isAvailableForRental(): Boolean {
        return isAvailable()
    }

    override fun toString(): String {
        return "Truck(model='${getModel()}', maxLoad=$maxLoadCapacity)"
    }
}