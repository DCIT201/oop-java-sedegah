class RentalTransaction(
    private val vehicle: Vehicle,
    private val customer: Customer,
    private val rentalDays: Int
) {

    fun processTransaction(): Double {
        vehicle.setAvailability(false)
        val totalCost = vehicle.calculateRentalCost(rentalDays)
        customer.addRentalToHistory("Rented ${vehicle.getModel()} for $rentalDays days at $$totalCost")
        return totalCost
    }

    override fun toString(): String {
        return "RentalTransaction(vehicle=${vehicle.getModel()}, customer=${customer.toString()}, days=$rentalDays)"
    }
}