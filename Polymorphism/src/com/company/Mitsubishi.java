package com.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name){
        super(cylinders,"name" );
    }


    public String startEngine() {
        return getClass().getSimpleName()+ " -> starting";
    }


    public String accelerate() {
        return getClass().getSimpleName()+ " -> accelerating ";
    }


    public String brake() {
        return getClass().getSimpleName()+ " -> braking";
    }
}
