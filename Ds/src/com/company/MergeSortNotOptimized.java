package com.company;

import java.util.Random;

public class MergeSortNotOptimized {

    public static void main(String[] args) {
        Random rand = new Random();
	    int[] sampleArr = new int[100000000 ];
	    for(int i =0; i<sampleArr.length ; i++){
	        sampleArr[i] = rand.nextInt();
        }
//	    int array[] = {2,4,1,5,6,8};

        System.out.println("Before:");
//        printArray(sampleArr);
        mergeSort(sampleArr);
        System.out.println("After:");
//        printArray(sampleArr);

    }
    public static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;
        if(inputLength<2){
            return;
        }
        int mid = inputLength/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[inputLength-mid];
        for(int i = 0; i<leftHalf.length ; i++){
            leftHalf[i] = inputArray[i];
        }
        for ( int i = mid ; i<inputLength; i++){
            rightHalf[i-mid]= inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray,leftHalf,rightHalf);
    }

    public static void merge(int[] array,int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;
        int i =0 , j =0 , k= 0;

        while(i<leftSize && j<rightSize){
            if(left[i]<=right[j]){
              array[k] = left[i];
              i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            array[k]=left[i];
            i++;
            k++;
        }
        while(j<rightSize){
            array[k]=right[j];
            j++;
            k++;
        }


    }

    public static void printArray( int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }

    }


}
