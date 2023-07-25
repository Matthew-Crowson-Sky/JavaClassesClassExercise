package com.qa.oop.classExercise;

public class Car extends Vehicle {
    private boolean isAutomatic;
    private boolean isBootOpen = false;
    private int bootSpace; // to the nearest Litre
    private int numOfDoors;

    public Car(int numOfWheels, int numOfSeats, boolean isManned,
               boolean isAutomatic, int bootSpace, int numOfDoors) {
        super(numOfWheels, numOfSeats, isManned, 300);
        this.isAutomatic = isAutomatic;
        this.bootSpace = bootSpace;
        this.numOfDoors = numOfDoors;
    }

    public void drive (){
        System.out.println("Car goes Vroom!");
    }

    public void openBoot(){
        this.isBootOpen = true;
    }

    public void closeBoot(){
        this.isBootOpen = false;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public boolean isBootOpen() {
        return isBootOpen;
    }

    public void setBootOpen(boolean bootOpen) {
        isBootOpen = bootOpen;
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
}
