package com.company;

public class Vehicle {
    private int wheels;
    private String steering;
    private boolean gear;
    private int model;
    private String fuelType;
    private int fuelCapacity;


    public Vehicle(int wheels,String steering,boolean gear,int model,String fuelType,int fuelCapacity){
        this.wheels=wheels;
        this.steering=steering;
        this.gear=gear;
        this.model=model;
        this.fuelType=fuelType;
        this.fuelCapacity=fuelCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public String getSteering() {
        return steering;
    }

    public boolean isGear() {
        return gear;
    }

    public int getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void speed(){

    }
    public void moving(){

    }
    public void changingGears(){

    }


}
