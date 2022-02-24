package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(arr.length);
        reverse(arr);


    }
    public static void reverse(int[] arr){
        int[] rra = Arrays.copyOf(arr,arr.length);
//        int count=0;
//        int maxIndex=rra.length-1;
//        while(count<rra.length){
//            rra[count]=arr[maxIndex];
//            System.out.println(count);
//            System.out.println("maxIndex"+maxIndex);
//            System.out.println(Arrays.toString(rra));
//            maxIndex--;
//            count++;
//        }




//        int maxIndex=rra.length-1;
//         for (int i =0; i<rra.length;i++){
//             while(true){
//                 rra[i]=arr[maxIndex];
//                 maxIndex--;
//                 break;
//             }
//         }
       int maxIndex = arr.length-1;
       int halflength=arr.length/2;
        System.out.println(halflength);
       for(int i=0; i<arr.length;i++){
           int temp = arr[i];
           arr[i]=arr[maxIndex-i];
           arr[maxIndex-i]=temp;
       }










        System.out.println(Arrays.toString(arr));
    }
}
