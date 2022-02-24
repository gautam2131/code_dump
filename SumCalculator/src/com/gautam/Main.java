package com.gautam;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator calculator=new SimpleCalculator();
	calculator.setFirstNumber(5);
	calculator.setSecondNumber(4);
        System.out.println("add"+calculator.getAdditionResult());
        System.out.println("sub"+calculator.getSubtractionResults());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("mul" + calculator.getMultiplicationResults());
        System.out.println("div"+calculator.getDivisonResults());
    }
}
