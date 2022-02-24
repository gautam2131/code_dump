package com.gautam;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubtractionResults(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResults(){
        return firstNumber*secondNumber;
    }
    public double getDivisonResults(){
        if(secondNumber==0) {
            return 0;
        }
        return firstNumber/secondNumber;
    }
}
