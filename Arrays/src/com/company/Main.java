package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntergers(5);
        for (int i =0; i< array.length;i++){
            System.out.println("my array values are " + array[i]);
        }
        System.out.println("Array average " + getAverage(array));



    }
    public static int[] getIntergers(int number){
        System.out.println("Enter "+ number +" numbers");
        int[] array = new int[number];
        for (int i =0;  i<number; i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static double getAverage(int[] array){
        int sum =0;
        for (int i =0 ;i < array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
    }
}
