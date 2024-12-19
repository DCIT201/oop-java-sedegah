class Customer2(
    private val customerId: String,
    private val name: String
) : LoyaltyProgram {

    private val rentalHistory: MutableList<String> = mutableListOf()
    private var loyaltyPoints: Int = 0 // Loyalty points tracking

    // Add a rental entry to the history
    fun addRentalToHistory(rentalDetails: String) {
        rentalHistory.add(rentalDetails)
    }

    // Get customer ID
    fun getCustomerId() = customerId

    // Get customer name
    fun getName() = name

    // Implement LoyaltyProgram: Earn points
    override fun earnPoints(rentalCost: Double): Int {
        val pointsEarned = (rentalCost / 10).toInt() // Earn 1 point for every $10 spent
        loyaltyPoints += pointsEarned
        return pointsEarned
    }

    // Implement LoyaltyProgram: Redeem points
    override fun redeemPoints(points: Int): Double {
        if (points <= loyaltyPoints) {
            val discount = points * 0.5 // Each point is worth $0.50
            loyaltyPoints -= points
            return discount
        } else {
            throw IllegalArgumentException("Not enough loyalty points!")
        }
    }

    // Implement LoyaltyProgram: Get total points
    override fun getTotalPoints(): Int {
        return loyaltyPoints
    }

    override fun toString(): String {
        return "Customer(id='$customerId', name='$name', loyaltyPoints=$loyaltyPoints, rentalHistory=$rentalHistory)"
    }
}