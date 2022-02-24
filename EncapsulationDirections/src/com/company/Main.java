package com.company;

import java.awt.font.TextLayout;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    public Car(String name, int cylinders ){
        this.name=name;
        this.engine=true;
        this.cylinders=cylinders;
        this.wheels=4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public void startEngine(){
        System.out.println("vroom vroom");
    }
    public void accelerate(){
        System.out.println("vrooooooooooooooooooom");
    }
    public void brake(){
        System.out.println("stopuuuuuuuuuuuuu");
    }
}
class I10 extends Car{
    public I10(){
        super("I10",1);
    }

}
class City extends Car{
    public City(){
        super("city",4);
    }
    public void startEngine(){
        System.out.println("vrr vroom vrr vroom");
    }
}

class Innova extends Car{
    public Innova(){
        super("innnova", 8);
    }
    public void accelerate(){
        System.out.println("vroooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooom");
    }
    public void brake(){
        System.out.println("stopuuu");
    }
    public String fly(){
        return getClass().getSimpleName()+ " -> fly";
    }
}

public class Main {

    public static void main(String[] args) {
//	    double j=(0.9*10);
//        System.out.println(j);
//        int i = (int)j;
//        System.out.println(i);
        Car car = new Car("car",7);
        car.accelerate();
        car.startEngine();
        car.brake();

        I10 sportz= new I10();
        sportz.accelerate();
        sportz.brake();
        sportz.startEngine();

        Innova crysta = new Innova();
        crysta.accelerate();
        crysta.brake();
        crysta.startEngine();
        System.out.println(crysta.fly());
    }
}
