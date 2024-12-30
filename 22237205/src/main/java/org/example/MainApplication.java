package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MainApplication {
    public static void main(String[] args) {
        // Create vehicle instances
        com.vehicleRental.Vehicle car = new Car("GEN", "Genesis 2018", 50.0, 5);
        com.vehicleRental.Vehicle truck = new Truck("QA89", "Mercedes Truck", 100.0, 2000.0);
        com.vehicleRental.Vehicle motorcycle = new Motorcycle("BFW86", "Yamaha", 30.0, true);

        // Create a customer instance
        Customer customer = new Customer("CUST001", "Kimathi");

        // Process a rental transaction
        RentalTransaction transaction = new RentalTransaction(car, customer, 3);
        double totalCost = transaction.processTransaction();

        // Output total rental cost
        System.out.println("Total Rental Cost: $" + totalCost);
        System.out.println("Customer History: " + customer);

        // Apply loyalty discount
        int pointsToRedeem = 100;
        double discount = transaction.applyLoyaltyDiscount(pointsToRedeem);
        System.out.println("Loyalty Discount Applied: $" + discount);

        // Admin authentication
        Admin admin = new Admin("admin", "password");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Admin Username: ");
            String username = scanner.next();
            System.out.print("Enter Admin Password: ");
            String password = scanner.next();

            if (admin.authenticate(username, password)) {
                System.out.println("Welcome, Admin!");
                List<com.vehicleRental.Vehicle> fleet = Arrays.asList(car, truck, motorcycle);
                admin.manageVehicles(fleet);
            } else {
                System.out.println("Invalid credentials. Access denied.");
            }
        }
    }
}