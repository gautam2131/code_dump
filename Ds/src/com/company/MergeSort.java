package com.company;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] sampleArr = new int[100000000 ];
        for(int i =0; i<sampleArr.length ; i++){
            sampleArr[i] = rand.nextInt();
        }
//	    int array[] = {2,4,1,5,6,8};

        System.out.println("Before:");
//        printArray(sampleArr);
        mergeSort(sampleArr,0, sampleArr.length);
        System.out.println("After:");
//        printArray(sampleArr);

    }
    public static void mergeSort(int[] inputArray, int start , int end){
        if(end-start < 2){
            return;
        }
        int mid = (end + start) /2;
        mergeSort(inputArray,start,mid);
        mergeSort(inputArray,mid,end);

        merge(inputArray,start,mid,end);
    }

    public static void merge(int[] input , int start , int mid , int end){
        if(input[mid-1]<=input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end-start];

        while(i<mid && j<end){
            tempArray[tempIndex++] = input[i]<input[j]?input[i++]:input[j++];
        }
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(tempArray,0,input,start,tempIndex);


    }
    public static void printArray( int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
