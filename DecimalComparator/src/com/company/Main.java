package com.company;

public class Main {

    public static void main(String[] args) {
        boolean a=areEqualByThreeDecimalPlaces(3.1756,3.175);
        System.out.println(a);

    }
    public static boolean areEqualByThreeDecimalPlaces(double numberOne,double numberTwo ){

        int a =(int)(numberOne*1000);
        int b =(int)(numberTwo*1000);
//      System.out.println(a);
//       System.out.println(b);
        if(a==b){
            return true;
        }
        return false;



    }
}



