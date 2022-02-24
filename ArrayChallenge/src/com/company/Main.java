package com.company;

import java.util.Scanner;
        import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array= getintegers(35);
        printArray(array);
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
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if (array2[i]<=array2[j]) {

                    temp=array2[i];
                    array2[i]=array2[j];
                    array2[j]=temp;

                }

            }
        }
        return array2;
    }
}
