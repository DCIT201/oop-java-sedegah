package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String customerId;
    private final String name;
    private final List<String> rentalHistory = new ArrayList<>();
    private int loyaltyPoints;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.loyaltyPoints = 0;
    }

    public void addRentalToHistory(String rentalDetails) {
        rentalHistory.add(rentalDetails);
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", rentalHistory=" + rentalHistory +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}