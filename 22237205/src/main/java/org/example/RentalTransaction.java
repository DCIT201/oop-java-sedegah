package org.example;

import org.example.Customer;
import org.example.LoyaltyProgram;

class RentalTransaction {
    private com.vehicleRental.Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private LoyaltyProgram loyaltyProgram = new LoyaltyProgram2();

    public RentalTransaction(com.vehicleRental.Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public double processTransaction() {
        vehicle.setAvailability(false);
        double totalCost = vehicle.calculateRentalCost(rentalDays);
        customer.addRentalToHistory("Rented " + vehicle.getModel() + " for " + rentalDays + " days at $" + totalCost);

        int earnedPoints = loyaltyProgram.earnPoints(totalCost);
        customer.addLoyaltyPoints(earnedPoints);

        return totalCost;
    }

    public double applyLoyaltyDiscount(int pointsToRedeem) {
        double discount = loyaltyProgram.redeemPoints(pointsToRedeem);
        customer.addLoyaltyPoints(-pointsToRedeem);
        return discount;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "vehicle=" + vehicle.getModel() +
                ", customer=" + customer +
                ", rentalDays=" + rentalDays +
                '}';
    }
}