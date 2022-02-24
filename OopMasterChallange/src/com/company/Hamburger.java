package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price,String breadRolltType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRolltType;
        this.price = price;
        System.out.println(name + " on a " + breadRolltType + " with "+ meat + ", price is " +price);
    }

    public void addHamburgerAddition1(String name,double Price){
        this.addition1Price+=Price;
        addition1Name=name;
        System.out.println("Added "+ name +" for an extra "+Price);
    }
    public void addHamburgerAddition2(String name,double Price){
        this.addition2Price+=Price;
        addition2Name=name;
        System.out.println("Added "+ name +" for an extra "+Price);
    }
    public void addHamburgerAddition3(String name,double Price){
        this.addition3Price+=Price;
        addition3Name=name;
        System.out.println("Added "+ name +" for an extra "+Price);
    }
    public void addHamburgerAddition4(String name,double Price){
        this.addition4Price+=Price;
        addition4Name=name;
        System.out.println("Added "+ name +" for an extra "+Price);
    }
    public double itemizeHamburger(){
        return this.price +=addition1Price+addition2Price+addition3Price+addition4Price;
    }
}
