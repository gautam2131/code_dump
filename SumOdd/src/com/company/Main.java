package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(isOdd(1,100));
//        System.out.println(isEvenNumber(3));
        int number=4;
        int finishNumber=20;
        int count=0;
        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number" +number);
            if (count==5){
                System.out.println("Total even number found " + count);
                break;
            }
        }
    }
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if((number%2)==0){
            return false;
        }
        return true;
    }

    public static int isOdd(int start,int end ){
        int sum=0;
        if(start<0 || end <0 || (start>end)){
            return -1;
        }
        for(int i = start;i<=end;i++){
            if(isOdd(i)){
                sum +=i;

            }

        }
        return sum;

    }

    public static boolean isEvenNumber(int n){
        while(n%2==0){
            return true;
        }
        return false;
    }



}
