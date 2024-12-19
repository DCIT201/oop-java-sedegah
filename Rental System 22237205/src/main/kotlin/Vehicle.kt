abstract class Vehicle(
    private val vehicleId: String,
    private val model: String,
    private val baseRentalRate: Double
) {
    private var isAvailable: Boolean = true

    // Getters (Encapsulation)
    fun getVehicleId(): String = vehicleId
    fun getModel(): String = model
    fun getBaseRentalRate(): Double = baseRentalRate
    fun isAvailable(): Boolean = isAvailable

    // Setter to update availability
    fun setAvailability(available: Boolean) {
        isAvailable = available
    }

    // Abstract Methods (Abstraction)
    abstract fun calculateRentalCost(days: Int): Double
    abstract fun isAvailableForRental(): Boolean

    override fun toString(): String {
        return "Vehicle(id='$vehicleId', model='$model', baseRate=$baseRentalRate, available=$isAvailable)"
    }
}