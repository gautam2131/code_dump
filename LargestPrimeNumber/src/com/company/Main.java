package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number){


//        for(int i=number;i>=2;i--){
//            if(number% i==0){
//                primeNo=i;
//                break;
//            }
//            if(i==2){
//                return number;
//            }
//        }
//        return primeNo;
        if(number<2)return -1;

        for (int i = 2; i < number; i++) {
            System.out.println(i+"------");
            if(number%i==0){
                System.out.println("------"+i);
                number/=i;
                i--;
            }
        }
        return number;



    }
}
