package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5111));

    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int lastDigit=number%10;
        int firstDigit=0;
        while(number!=0){
//            System.out.println("1");
             firstDigit = number%10;
             number /=10;

        }
        return firstDigit+lastDigit;

    }
}
