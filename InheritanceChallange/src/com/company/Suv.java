package com.company;

public class Suv  extends Car{
    public Suv(String steering, boolean gear, int model, String fuelType, int fuelCapacity, int gearCount) {
        super(steering, gear, model, fuelType, fuelCapacity, "suv", 9, gearCount);
    }

    public void offroad(){

    }

}
