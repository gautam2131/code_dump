package com.company;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] sampleArr = new int[100000];
        for(int i =0; i<sampleArr.length ; i++){
            sampleArr[i] = rand.nextInt();
        }
//	    int array[] = {2,4,1,5,6,8};

        System.out.println("Before:");
//        printArray(sampleArr);
         quickSort(sampleArr,0,sampleArr.length-1);
        System.out.println("After:");
        printArray(sampleArr);

    }

    public static void quickSort(int[] array,int start, int end){
        if(end-start < 1 ){
            return;
        }

        int pivotIndex = partition(array,start,end);

        quickSort(array,start,pivotIndex-1);
        quickSort(array,pivotIndex+1,end);

    }
    public static int partition(int[] array, int start ,int end){
       int leftPointer = start;
       int rightPointer = end;
       int pivot = array[start];
        while(leftPointer<rightPointer){
            while(array[rightPointer]>=pivot&& leftPointer<rightPointer){
                rightPointer--;
            }
            while(array[leftPointer]<=pivot&& leftPointer<rightPointer){
                leftPointer++;
            }

            swap(array,rightPointer,leftPointer);
        }
        swap(array,start,leftPointer);
        return leftPointer;

    }

    public static void printArray( int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }

    }
    public static void swap(int[] array, int index1,int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

}
