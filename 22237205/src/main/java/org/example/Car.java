package org.example;

class Car extends com.vehicleRental.Vehicle {
    private int passengerCapacity;

    public Car(String vehicleId, String model, double baseRentalRate, int passengerCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + getModel() + '\'' + ", capacity=" + passengerCapacity + '}';
    }
}