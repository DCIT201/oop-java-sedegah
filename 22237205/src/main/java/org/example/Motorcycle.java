package org.example;

class Motorcycle extends com.vehicleRental.Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * (hasSidecar ? 1.2 : 1.0);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "model='" + getModel() + '\'' + ", hasSidecar=" + hasSidecar + '}';
    }
}