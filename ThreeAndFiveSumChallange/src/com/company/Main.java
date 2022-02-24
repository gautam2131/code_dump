package com.company;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=1;i<=1000;i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum +=i;
                System.out.println("Found number = "+i);
                System.out.println("sum = " +sum);
                if(count==5){
                    System.out.println("Exit @ " +count);
                    break;
                }

            }
        }

    }
}
