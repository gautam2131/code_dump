package com.company;

public class Main {

    public static void main(String[] args) {
	int[]  array= {5,7,8};
	for(int i =0; i< array.length; i++){
	    for(int j =i+1; j < array.length; j++){
	        if(array[i]<array[j]){
	            int temp = array[i];
	            array[i]= array[j];
	           array[j]=temp;
				System.out.println("*******************************************");
				printArray(array);
				System.out.println("############################################");
            }
        }
    }
	printArray(array);

    }
	public static void printArray(int[] array){
		for (int i=0; i< array.length;i++){
			System.out.println("position "+ i + ", has " + array[i]);
		}
	}
}
