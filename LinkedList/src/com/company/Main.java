package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(" bala" , 54.3);
        Customer anotherCustomer;

        anotherCustomer = customer;
        anotherCustomer.setBalance(3.3);
        System.out.println("Balance for customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(Integer.valueOf(1));
        intList.add(3);
        intList.add(4);

        for(int i = 0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i).intValue());
        }

        intList.add(1,2);

        for(int i = 0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i).intValue());
        }

    }
}
