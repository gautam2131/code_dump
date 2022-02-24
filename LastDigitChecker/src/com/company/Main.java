package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(22,23,34));
        System.out.println(hasSameLastDigit(9,99,999));

    }
    public static boolean hasSameLastDigit(int a ,int b,int c){
        if (a < 10 ||b < 10 ||c < 10 ||a>1000 ||b>1000 ||c>1000 ){
            return false;
        }
        int ldOfA=a%10;
        int ldOfb=b%10;
        int ldOfc=c%10;
        return((ldOfA==ldOfb)||(ldOfA==ldOfc)||(ldOfb==ldOfc));
    }
    public static boolean isValid(int a){
        return (a >=10 && a<=1000);
    }

}
