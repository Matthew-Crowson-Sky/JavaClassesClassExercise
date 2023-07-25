package com.qa.oop.classExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage(Vehicle... vehicles){
        this.vehicles = new ArrayList<>(Arrays.asList(vehicles));
    }


    // Iterates through all vehicles in garage to find total bill
    public double totalRepairPrice(){
        double totalPrice = 0.00;
        for (Vehicle vehicle : this.vehicles) {
            totalPrice += vehicle.getRepairPrice();
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

        for (Vehicle vehicle : new ArrayList<Vehicle>(this.vehicles)){
            if (vehicle.getID() == vehicleID) {
                this.vehicles.remove(vehicle);
                return true;
            }
        }

        return false;
    }

    // remove multiple vehicles by type
    public int removeVehicles(Class  clazz){
        int vehiclesRemoved = 0;

        for (Vehicle vehicle: new ArrayList<>(this.vehicles)) {
            if (clazz.getName().equals(vehicle.getClass().getName())) {
                removeVehicle(vehicle.getID());
                vehiclesRemoved++;
            }
        }

        return vehiclesRemoved;
    }

    public void emptyGarage(){
        this.vehicles = new ArrayList<>();
    }
}
