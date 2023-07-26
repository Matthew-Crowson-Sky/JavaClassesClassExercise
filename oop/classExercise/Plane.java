package com.qa.oop.classExercise;

public class Plane extends Vehicle implements Flyable{
    private int numOfEngines;

    public Plane(int numOfWheels, int numOfSeats, boolean isManned, int numOfEngines) {
        super(numOfWheels, numOfSeats, isManned);
        this.numOfEngines = numOfEngines;
    }

    @Override // Overriding method from interface
    public void fly() {
        System.out.println("Nyoooom!!");
    }
    @Override // Overriding method from abstract class
    public double getRepairPrice() {
        return 50_000;
    }
    public int getNumOfEngines() {
        return numOfEngines;
    }

    public void setNumOfEngines(int numOfEngines) {
        this.numOfEngines = numOfEngines;
    }


}
