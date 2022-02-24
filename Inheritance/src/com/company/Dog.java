package com.company;

public class Dog extends Animal {

    private  int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String caot;

    public Dog(){

    }

    public Dog(String name, int brain, int body, int size, int weight, int eyes) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
    }

    public Dog(String name, int size, int weight, int eyes , int legs , int tail , int teeth , String coat) {
        super(name,1, 1, size, weight);
    }



    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();

    }
    public static void talk(){
        int a =1;
    }
    public static void sleep(){
        Dog tom= new Dog();
        tom.chew();
        System.out.println("static here");
    }
    public void chew(){

        System.out.println("dog.chew() called");
    }

}
