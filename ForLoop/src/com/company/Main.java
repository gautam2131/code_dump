package com.company;

public class Main {

    public static void main(String[] args) {

        int count=0;
      for(int i=0;i<100;i++){

          if(isPrime(i)){
              count++;
              System.out.println("Number " + i + " is prime number");

              if(count==20){

                  System.out.println("Reached requested number of times");
                  break;

              }

          }
      }
//        for (int i = 8; i >; i--) {
//            double r = calculatorInterst(10000, i);
//            System.out.println("Interest for amount 1000 and interest " + i + " = " + String.format("%.2f", r));
//
//        }
    }
//    public static double calculatorInterst(double amt, double interstRate){
//        return amt*(interstRate/100);
//    }
//    }
    public static boolean isPrime(int n){

        if(n<2){
            return false;

        }
        for (int i=2 ; i<=(long)Math.sqrt(n);i++){
            System.out.println("factors i checked with "+ i);
            if (n % i == 0) {
                System.out.println(n + "is not prime number");
                return false;


            }
        }
        return true;

    }
}