package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min=0;
        int max=0;
        boolean first=true;
        while (true) {
            System.out.println("Enter Number");
            boolean isItInt=scanner.hasNextInt();

            if (isItInt){
                int number=scanner.nextInt();
                if(first){
                    first=false;
                    max=number;
                    min=number;
                }
                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }

            }
           else{
               System.out.println("Invalid value");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min= "+min +",max= "+max);
        scanner.close();
    }
}

