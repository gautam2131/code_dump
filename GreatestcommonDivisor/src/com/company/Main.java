package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(50,12));
    }
    public static int getGreatestCommonDivisor(int first ,int second ){
        if(first<10 || second<10){
            return -1;
        }
        int gcd=0;
        int smallest= first>second? second : first;
//        System.out.println(smallest);
        for(int i=smallest; i>=1 ;i--){
            if((first%i==0)&&(second%i==0)){
                gcd=i;
                break;
            }

        }

        return gcd;

    }

}
