interface LoyaltyProgram {
    // Earn points based on the rental cost
    fun earnPoints(rentalCost: Double): Int

    // Redeem points for a discount
    fun redeemPoints(points: Int): Double

    // Get the total points of a customer
    fun getTotalPoints(): Int
}