package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger k = BigInteger.valueOf(100);
        System.out.println(recursiveFactorial(k));
    }
    public static int factorial(int n){
        if(n==0)
            return 1;
//        int factorial = n;
//        if(n>0)
//        {
//            for(int i=n;i>1;i--){
//                System.out.println("--");
//               factorial *= (i-1);
//            }
//        }
//        return factorial;
        int factorial = 1;
        int mul ;
//        while(mul <= n){
//            factorial *=mul;
//            mul++;
//
//        }
        for(mul = 1; mul <= n; mul++){
            factorial *=mul;

        }
        return factorial;

    }



    public static BigInteger recursiveFactorial(BigInteger k ){
        if(k ==BigInteger.valueOf(0)){
            return BigInteger.valueOf(1);
        }
        return k.multiply(recursiveFactorial(k.subtract(BigInteger.valueOf(1)))) ;
    }
}
