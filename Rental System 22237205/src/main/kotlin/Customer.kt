class Customer(
    private val customerId: String,
    private val name: String
) {

    private val rentalHistory: MutableList<String> = mutableListOf()

    fun addRentalToHistory(rentalDetails: String) {
        rentalHistory.add(rentalDetails)
    }

    override fun toString(): String {
        return "Customer(id='$customerId', name='$name', rentalHistory=$rentalHistory)"
    }
}