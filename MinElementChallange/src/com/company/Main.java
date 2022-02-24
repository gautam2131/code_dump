package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println( "Smallest number in array = " +findMin(readIntegers()));

    }
    private static int readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of the array");
        int count = scanner.nextInt();
        return count;
    }
    public static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            scanner.nextLine();
        }
        return arr;
    }
   private static int findMin(int[] arr){
        int smallest = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
   }

}
