package com.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


    public String startEngine() {
        return getClass().getSimpleName()+ " -> startengine";
    }


    public String accelerate() {
        return getClass().getSimpleName()+ " -> accelerate ";
    }


    public String brake() {
        return getClass().getSimpleName()+ " -> braking ";
    }
}
