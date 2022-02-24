package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array= getintegers(9);
//        printArray(array);
        printArray(sortIntegers(array));
        System.out.println("############");

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
//        System.out.println("Array length"+ array2.length);

        for(int i =0; i<array2.length;i++){
            int smallest=i;
            for(int j =i+1;j<array2.length;j++){
                if(array2[smallest]>array2[j]){
                    smallest=j;
                }
            }
           if(smallest!=i){
//               System.out.println(i);
               int temp =array2[i];
               array2[i]=array2[smallest];
               array2[smallest]=temp;
           }
            System.out.println("********************************");
            printArray(array2);
            System.out.println("********************************");


        }
        return array2;
}
}
