package com.qa.oop.classExercise;

public class Runner {
    public static void main(String[] args) {
        Garage g = new Garage();

        // add vehicles to garage
        g.addVehicle(new Car(4, 5, true, false, 50, 4));

        Car car = new Car(3, 4, true, true, 45, 4);
        Motorbike bike = new Motorbike(2, 1, true, false);
        SailBoat boat = new SailBoat(0, 10, true, true, 3,
                5, 10, true);

        g.addVehicles(car, bike, boat);

        Car car2 = new Car(4, 2, true, false, 20, 2);
        g.addVehicle(car2);

        System.out.println(g.getVehicles());

        g.removeVehicle(1);
        System.out.println(g.getVehicles());

        g.removeVehicles("Car");
        System.out.println(g.getVehicles());

        g.emptyGarage();
        System.out.println(g.getVehicles());

    }
}
