package org.example;

import java.util.List;

class Admin {
    private final String username;
    private final String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    public void manageVehicles(List<com.vehicleRental.Vehicle> fleet) {
        System.out.println("Current fleet:");
        for (com.vehicleRental.Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
    }
}