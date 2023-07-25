package com.qa.oop.classExercise;

public class Motorbike extends Vehicle{
    private boolean hasSideCar;

    public Motorbike(int numOfWheels, int numOfSeats, boolean isManned, boolean hasSideCar) {
        super(numOfWheels, numOfSeats, isManned, 150);
        this.hasSideCar = hasSideCar;
    }

    public void ride(){
        System.out.println("Motorbike goes Vroom!");
    }

    public void wheelie(){
        System.out.println("Motorbike does a wheelie.");
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}
