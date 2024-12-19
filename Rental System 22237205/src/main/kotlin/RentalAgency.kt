class RentalAgency(
    private val name: String,
    private val fleet: MutableList<Vehicle>
) {

    fun addVehicle(vehicle: Vehicle) {
        fleet.add(vehicle)
    }

    fun listAvailableVehicles(): List<Vehicle> {
        return fleet.filter { it.isAvailable() }
    }

    override fun toString(): String {
        return "RentalAgency(name='$name', vehicles=$fleet)"
    }
}