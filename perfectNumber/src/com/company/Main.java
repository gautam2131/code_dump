package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));


    }
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sum =0;
       for(int i=1;i<number;i++){
         while(number%i==0){
             sum +=i;
             break;
         }
       }
       return sum==number;
    }
}
