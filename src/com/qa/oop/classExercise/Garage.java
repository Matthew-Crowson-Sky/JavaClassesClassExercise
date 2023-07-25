package com.qa.oop.classExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage(Vehicle... vehicles){
        this.vehicles = new ArrayList<>(Arrays.asList(vehicles));
    }

    private double repairPrice(Vehicle vehicle){
        return vehicle.getRepairPrice();
    }

    // Iterates through all vehicles in garage to find total bill
    public double totalRepairPrice(){
        double totalPrice = 0.00;
        for (Vehicle vehicle : this.vehicles) {
            totalPrice += repairPrice(vehicle);
        }
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    public int addVehicles(Vehicle... vehicles){
        this.vehicles.addAll(Arrays.asList(vehicles));

        // for convenience, return num Vehicles in garage after adding
        return this.vehicles.size();
    }

    public int addVehicle(Vehicle vehicle){
        return addVehicles(vehicle);
    }

    public List<Vehicle> getVehicles(){
        return this.vehicles;
    }

    // returns true if vehicle is found and removed
    public boolean removeVehicle(int vehicleID){

        for (int i = 0; i < this.vehicles.size(); i++) {
            Vehicle vehicle = this.vehicles.get(i);

            if (vehicle.getID() == vehicleID) {
                this.vehicles.remove(i);
                return true;
            }
        }
        return false;
    }

    // remove multiple vehicles by type
    public int removeVehicles(String vehicleType){
        vehicleType = vehicleType.toLowerCase();

        for (int i = 0; i < this.vehicles.size(); i++) {
            Vehicle vehicle = this.vehicles.get(i);

            // get class name for vehicle
            String vehicleClass = vehicle.getClass().getSimpleName();
            vehicleClass = vehicleClass.toLowerCase();

            if (vehicleType.equals(vehicleClass)) {
                removeVehicle(vehicle.getID());
            }
        }
        return 0;

    }

    public void emptyGarage(){
        this.vehicles = new ArrayList<>();
    }
}
