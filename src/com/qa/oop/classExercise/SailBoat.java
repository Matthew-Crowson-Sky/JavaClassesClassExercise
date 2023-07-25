package com.qa.oop.classExercise;

public class SailBoat extends Vehicle {
    private boolean hasRadar;
    private int numOfSails;
    private int minCrewSize;
    private int maxCrewSize;
    private boolean isMoored;

    public SailBoat (int numOfWheels, int numOfSeats, boolean isManned,
                    boolean hasRadar, int numOfSails, int minCrewSize,
                    int maxCrewSize, boolean isMoored) {
        super(numOfWheels, numOfSeats, isManned, 500);

        // Make sure crew size values make sense
        if (minCrewSize < 0 || maxCrewSize < minCrewSize){
            throw new IllegalArgumentException("Crew size values not valid.");
        }

        this.hasRadar = hasRadar;
        this.numOfSails = numOfSails;
        this.minCrewSize = minCrewSize;
        this.maxCrewSize = maxCrewSize;
        this.isMoored = isMoored;
    }

    public void sail(){
        if (this.isMoored) this.isMoored = false;
        System.out.println("Sail Boat is sailing.");
    }

    public void moorBoat(){
        this.isMoored = true;
    }

    public boolean isHasRadar() {
        return hasRadar;
    }

    public void setHasRadar(boolean hasRadar) {
        this.hasRadar = hasRadar;
    }

    public int getNumOfSails() {
        return numOfSails;
    }

    public void setNumOfSails(int numOfSails) {
        this.numOfSails = numOfSails;
    }

    public int getMinCrewSize() {
        return minCrewSize;
    }

    public void setMinCrewSize(int minCrewSize) {
        this.minCrewSize = minCrewSize;
    }

    public int getMaxCrewSize() {
        return maxCrewSize;
    }

    public void setMaxCrewSize(int maxCrewSize) {
        this.maxCrewSize = maxCrewSize;
    }

    public boolean isMoored() {
        return isMoored;
    }

    public void setMoored(boolean moored) {
        isMoored = moored;
    }
}
