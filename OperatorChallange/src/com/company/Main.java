package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 20d;
        double b = 80d;
        double sum=(a+b)*100d;
        System.out.println(sum);
        double remainder = sum % 40d;
        System.out.println("remainder value ="+remainder);

        boolean booleanVariable = (remainder==0)? true: false;
        System.out.println(booleanVariable);

        if(!booleanVariable){
            System.out.println("got some remainder");
        }

    }
}
