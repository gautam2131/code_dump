package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(5,55));
        System.out.println(hasSharedDigit(12,23));

    }
    public static boolean hasSharedDigit(int num1,int num2){
        if(num1<10 || num2<10 || num1>99|| num2 >99){
            return false;
        }
        int fdOfnum1=0;
        int fdOfnum2=0;
        int ldOfNum1=num1%10;
        int ldOfNum2=num2%10;
        while(num1!=0){
            fdOfnum1=num1%10;
            num1 /=10;
        }
        while(num2!=0){
            fdOfnum2=num2%10;
            num2 /=10;
        }
//        System.out.println("first digit " +fdOfnum1+ " last digit " +ldOfNum1);
//        System.out.println("first digit " +fdOfnum2+ " last digit " +ldOfNum2);
        return ((fdOfnum1==fdOfnum2)||(ldOfNum1==ldOfNum2)||(fdOfnum1==ldOfNum2)||(fdOfnum2==ldOfNum1));
    }

}
