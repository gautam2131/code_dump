package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;

    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat,double price){
        super("Healthy burger",meat, price,"brown bread");


    }


    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name=name;
        healthyExtra1Price =price;
        System.out.println("Added "+ name +" for an extra "+price);
    }


    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name=name;
        healthyExtra2Price =price;
        System.out.println("Added "+ name +" for an extra "+price);

    }

    @Override
    public double itemizeHamburger() {
        return (super.itemizeHamburger()+ healthyExtra1Price + healthyExtra2Price);
    }
}
