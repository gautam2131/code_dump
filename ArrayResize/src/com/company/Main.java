package com.company;

import java.util.Scanner;

public class Main {
     private static Scanner s = new Scanner(System.in);
     private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("enter 10 ints");
        getInput();
        printArray( baseData);
        resizeArray();
//        System.out.println("enter 12 ints" );
//        getInput();
//        baseData[10]=11;
//        baseData[11]=12;
        printArray(baseData);

    }
    public static void getInput(){
        for(int i=0; i<baseData.length;i++){
            baseData[i]=s.nextInt();
        }
    }
    public static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];
        for(int i=0; i<original.length;i++){
            baseData[i]=original[i];
        }
    }
}
