package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array= getintegers(3);
//        printArray(array);
        printArray(sortIntegers(array));



    }
    public static int[] getintegers(int number){
        int[] array = new int[number];
        for(int i=0; i< number;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i=0; i< array.length;i++){
            System.out.println("Element "+ i + " Contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] array2= Arrays.copyOf(array,array.length);
        int temp = 0;
       for(int i=1 ;i<array2.length;i++){
           temp = array2[i];
           int j = i-1;
           while( j>=0 && temp<array2[j]){
               array2[j+1]=array2[j];
               j = j-1;
           }
           array2[j+1]=temp;
       }
        return array2;
    }
}
