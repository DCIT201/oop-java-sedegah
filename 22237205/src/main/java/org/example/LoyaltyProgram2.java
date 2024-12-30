package org.example;

import org.example.LoyaltyProgram;

class LoyaltyProgram2 implements LoyaltyProgram {
    private static final int POINTS_PER_DOLLAR = 10;
    private static final double DISCOUNT_PER_POINT = 0.01;

    @Override
    public int earnPoints(double rentalCost) {
        return (int) (rentalCost * POINTS_PER_DOLLAR);
    }

    @Override
    public double redeemPoints(int points) {
        return points * DISCOUNT_PER_POINT;
    }
}

