package com.qa.oop.classExercise;

import java.awt.*;

public class Bird implements Flyable {
    private Color colour;

    public Bird(Color colour) {
        this.colour = colour;
    }

    @Override
    public void fly() {
        System.out.println("Flap Flap Flap.");
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }
}
