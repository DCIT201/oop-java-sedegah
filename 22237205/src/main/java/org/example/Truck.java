package org.example;

class Truck extends com.vehicleRental.Vehicle {
    private double maxLoadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double maxLoadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * 1.5 * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Truck{" + "model='" + getModel() + '\'' + ", maxLoad=" + maxLoadCapacity + '}';
    }
}