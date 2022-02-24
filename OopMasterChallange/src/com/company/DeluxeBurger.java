package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("deluxe", "rosted chicken" ,19.10,"mega bun" );
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double Price) {
        System.out.println("no additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double Price) {
        System.out.println("no additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double Price) {
        System.out.println("no additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double Price) {
        System.out.println("no additional items can be added to a deluxe burger");
    }
}
