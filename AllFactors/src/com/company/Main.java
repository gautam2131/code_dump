package com.company;

public class Main {

    public static void main(String[] args) {
printFactors(70);
    }

    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        for(int i=1;i<=number;i++){
          while(number%i==0){
              System.out.println(i);
              break;
            }
        }


    }

}
