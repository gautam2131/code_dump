package com.company;

public class Main {

    public static void main(String[] args) {
               Hamburger hamburger = new Hamburger("Basic","Sausage", 3.56,"white");
               hamburger.addHamburgerAddition1("Tomato", 0.27);
               hamburger.addHamburgerAddition2("Lettuce",0.75);
               hamburger.addHamburgerAddition3("cheese",1.13);
        System.out.println("Total Burger price is "+hamburger.itemizehamburger());

        HealthyBurger healthyBureger = new HealthyBurger("Bacon", 5.67);
        healthyBureger.addHamburgerAddition1("Egg",5.43);
        healthyBureger.addHamburgerAddition2("Lentils",3.41);
        System.out.println("Total Healthy Burger price is " + healthyBureger.itemizehamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("shold not do this", 50.2);
        System.out.println("total deluxe Burger price is "+ db.itemizehamburger());
    }
}
