import com.example.vehicle.Car
import com.example.vehicle.Motorcycle

fun main() {
    // Initialize vehicles
    val car = Car("CAR123", "Toyota Corolla", 50.0, 5)
    val motorcycle = Motorcycle("MC456", "Honda CB500", 30.0, false)
    val truck = Truck("TR789", "Volvo Truck", 100.0, 2000.0)

    // Initialize customer
    val customer = Customer("CUST001", "Kimathi")

    // Initialize rental agency
    val rentalAgency = RentalAgency("Elite Rentals", mutableListOf(car, motorcycle, truck))

    // Process a rental transaction
    val transaction = RentalTransaction(car, customer, 3)
    val totalCost = transaction.processTransaction()

    println("Total Rental Cost: $$totalCost")
    println("Available Vehicles: ${rentalAgency.listAvailableVehicles()}")
}