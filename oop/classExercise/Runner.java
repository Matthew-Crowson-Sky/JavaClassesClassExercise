package com.qa.oop.classExercise;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Garage g = new Garage();

        // add vehicles to garage
        g.addVehicle(new Car(4, 5, true, false, 50, 4));

        // create more vehicles
        Car car = new Car(3, 4, true, true, 45, 4);
        Motorbike bike = new Motorbike(2, 1, true, false);
        SailBoat boat = new SailBoat(0, 10, true, true, 3,
                5, 10, true);

        // add single vehicle to garage
        g.addVehicles(car, bike, boat);

        // add multiple vehicles to garage in one go
        Car car2 = new Car(4, 2, true, false, 20, 2);
        g.addVehicle(car2);

        System.out.println("Vehicles Added to garage:" + g.getVehicles());

        // Vehicles are already in order of ID
        // So shuffle before sorting
        List<Vehicle> vehicles = new ArrayList<>(g.getVehicles());
        Collections.shuffle(vehicles);
        System.out.println("shuffled vehicles = " + vehicles);
        Collections.sort(vehicles);
        System.out.println("sorted vehicles = " + vehicles);

        // get total repair bill for all vehicles in garage
        System.out.println("total repair price" + g.totalRepairPrice());

        // Test removing vehicle by ID
        g.removeVehicle(1);
        System.out.println("remove vehicle with ID of 1: " + g.getVehicles());

        // Remove vehicle by class type
        g.removeVehicles(car.getClass());
        System.out.println("remove all cars: " + g.getVehicles());

        // try out VehicleNotFoundException
//        try {
//            g.findVehicle(1);
//        } catch (VehicleNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        // empty the whole garage
        g.emptyGarage();
        System.out.println("empty garage" + g.getVehicles());




        // Test out Flyable interface
        System.out.println("\n\n");
        Flyable[] flyingThings = new Flyable[4];
        for (int i = 0; i < flyingThings.length; i++) {
            if (i % 2 == 0){
                flyingThings[i] = new Bird(Color.yellow);
            } else {
                flyingThings[i] = new Plane(14, 150, true, 2);
            }
        }

        for (Flyable flyingThing : flyingThings) {
            System.out.print(flyingThing.getClass().getSimpleName() + ": ");
            flyingThing.fly();
        }
    }
}
