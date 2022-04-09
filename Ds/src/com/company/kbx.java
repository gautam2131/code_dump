package com.company;

public class kbx {
    public static void main(String []args){

        int[] array1 = {1,3,4,5};
        int[] array2 = {2,4,6,8};
        int[] finalArray = new int[array1.length+array2.length];
        int length1 = array1.length;
        int length2 =array2.length;
        //Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

        //Time complexity for merging is o(n1*n2)
        mergeArrays(array1, array2, length1, length2,finalArray);
        // print
        System.out.println("Array after merging");
        for(int i=0;i<length1+length2;i++){
            System.out.print(finalArray[i]+" ");
        }
    }
    public static void mergeArrays(int[] array1, int[] array2, int length1,
                                   int length2, int[] finalArray){
        int i =0 , j=0 ,k=0;

        //traversing both array
        while(i<length1 && j<length2){
            //checking first element of the array1 is smaller the array2.
            //if it is adding first element of the array1 to final array.and increment i
            //else.do the same with second array
            if(array1[i]<=array2[j]){
                finalArray[k++]=array1[i++];
            }
            else{
                finalArray[k++]=array2[j++];
            }

        }
        // handle the remaining element in array1 if there is any.
        while(i < length1){
            finalArray[k++]=array1[i++];

        }
        // handle the remaining element in array2 if there is any.
        while(j < length2){
            finalArray[k++]=array2[j++];

        }

    }
}
