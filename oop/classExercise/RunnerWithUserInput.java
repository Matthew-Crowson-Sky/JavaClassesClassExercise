package com.qa.oop.classExercise;

import java.io.IOException;

public class RunnerWithUserInput {
    public static void main(String[] args) throws IOException {
        Garage garage = new Garage();
        System.out.println("Welcome to the Garage.");

        try (UserInput userInput = new UserInput()) {
            boolean exit = false;

            do {
                System.out.println("\nWhat would you like to do? (type a number and press ENTER)");
                System.out.println("1. Add a Vehicle");
                System.out.println("2. Remove a Vehicle");
                System.out.println("3. Find Vehicle");

                int selection = userInput.getPositiveInt();

                if (selection == 1){ // User wants to Add a vehicle
                    System.out.println("Which type of vehicle would you like to add?");
                    System.out.println("1. Car");
                    System.out.println("2. Motorbike");
                    System.out.println("3. Sail Boat");
                    System.out.println("4. Plane");

                    Vehicle vehicleToAdd = null;
                    do {
                        selection = userInput.getPositiveInt();

                        if (selection == 1) { // User wants to add a Car
                            vehicleToAdd = new Car(4, 4, true,
                                    true, 400, 4);
                        }
                        if (selection == 2) { // User wants to add a Motorbike
                            vehicleToAdd = new Motorbike(2, 2, true, false);
                        }
                        if (selection == 3) {// User wants to add a Sail Boat
                            vehicleToAdd = new SailBoat(0, 10, true, false,
                                    3, 2,4, false);
                        }
                        if (selection == 4) {// User wants to add a Plane
                            vehicleToAdd = new Plane(10, 100, true, 2);
                        }
                    } while (vehicleToAdd == null);

                    garage.addVehicle(vehicleToAdd);
                    System.out.println(vehicleToAdd + " has been added to the garage.");
                    System.out.println("The garage currently contains: " + garage.getVehicles());

                }
                if (selection == 2){ // User wants to remove a vehicles.
                    System.out.println("Select removal method.");
                    System.out.println("1. Remove ONE vehicle by ID");
                    System.out.println("2. Remove ALL vehicles of a specific type.");
                    System.out.println("3. Remove ALL vehicles.");

                    boolean vehicleRemoved = false;
                    while (!vehicleRemoved) {
                        selection = userInput.getPositiveInt();

                        if (selection == 1) {
                            System.out.println();
                        }
                        if (selection == 2) {

                        }
                        if (selection == 3) {

                        }
                    }


                }
                if (selection == 3){// user wants to find vehicle

                }

            } while (!exit);


        }
    }
}
