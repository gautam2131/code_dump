package com.company;

public class Car extends Vehicle {
    private String type;
    private int seatCount;
    private int gearCount;

    public Car(String steering, boolean gear, int model, String fuelType, int fuelCapacity, String type, int seatCount,int gearCount) {
        super(4, steering, gear, model, fuelType, fuelCapacity);
        this.type = type;
        this.seatCount = seatCount;
        this.gearCount=gearCount;
    }

    public String getType() {
        return type;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public int getGearCount() {
        return gearCount;
    }
}
