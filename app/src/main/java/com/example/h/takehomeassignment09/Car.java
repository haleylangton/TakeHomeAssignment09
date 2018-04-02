package com.example.h.takehomeassignment09;


public class Car {
    private String make;
    private int numberOfDoors;
    private boolean isRed;

    public Car(){}

    public Car(String make, int numberOfDoors, boolean isRed){

        this.make = make;
        this.numberOfDoors = numberOfDoors;
        this.isRed = isRed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isRed() {
        return isRed;
    }

    public void setRed(boolean red) {
        this.isRed = red;
    }
}
