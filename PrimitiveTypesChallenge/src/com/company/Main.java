package com.company;

public class Main {

    public static void main(String[] args) {
        byte A=10;
        short B=20;
        int C=50;
        long d=50000L+ 10L*(A+B+C);
        System.out.println("My Calculated Value is"+d);

        short shortTotal = (short) (1000+10*(A+B+C));
    }
}
