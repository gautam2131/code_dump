package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int counter=0;
        while(scanner.hasNextInt()){
              sum += scanner.nextInt();
            counter++;


        }
        System.out.println("SUM = " + sum +" AVG = "+ Math.round((double)sum/counter) );
        scanner.close();
    }
//public static void inputThenPrintSumAndAverage(){
//    Scanner scanner = new Scanner(System.in);
//    int sum = 0;
//    int count = 0;
//
//    while(scanner.hasNextInt()){
//        sum += scanner.nextInt();
//        count++;
//        scanner.nextLine();
//    }
//    System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
//    scanner.close();
}
//}
