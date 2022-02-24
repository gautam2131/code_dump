package com.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }


    public String startEngine() {
        return getClass().getSimpleName()+ " -> startEngine";
    }


    public String accelerate() {
        return getClass().getSimpleName()+ " -> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+  " -> brake ";
    }
}
