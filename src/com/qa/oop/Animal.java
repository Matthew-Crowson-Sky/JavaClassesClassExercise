package com.qa.oop;

public class Animal {
    private boolean hasFur;
    private int noOfLegs;
    private boolean isFluffy;
    private String colour;

    public Animal(boolean hasFur, int noOfLegs, boolean isFluffy, String colour) {
        super();
        this.hasFur = hasFur;
        this.noOfLegs = noOfLegs;
        this.isFluffy = isFluffy;
        this.colour = colour;
    }

    public void sleep(){}
    public void walk(){}
    public void speak(){}

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean isFluffy() {
        return isFluffy;
    }

    public void setFluffy(boolean fluffy) {
        isFluffy = fluffy;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
