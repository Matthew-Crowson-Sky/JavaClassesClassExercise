package com.qa.oop.classExercise;

public abstract class Vehicle {
    private int numOfWheels;
    private int numOfSeats;
    private boolean isManned;
    private boolean isOn = false;
    private final int ID;
    private double repairPrice;

    private static int nextID = 0;

    public Vehicle(int numOfWheels, int numOfSeats, boolean isManned, double repairPrice) {
        this.numOfWheels = numOfWheels;
        this.numOfSeats = numOfSeats;
        this.isManned = isManned;
        this.repairPrice = repairPrice;

        // assign unique ID (Not thread-safe and will overflow)
        this.ID = nextID;
        nextID++;
    }

    public void switchOn(){
        this.isOn = true;
    }

    public void switchOff(){
        this.isOn = false;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public boolean isManned() {
        return isManned;
    }

    public void setManned(boolean manned) {
        isManned = manned;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getID() {
        return ID;
    }

    public double getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(double repairPrice) {
        this.repairPrice = repairPrice;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + Integer.toString(ID);
    }
}
