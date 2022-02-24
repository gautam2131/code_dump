package com.company;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[7];
		int array1[];
		array1 = new int[5];
		int array2[]=new int[4];
		System.out.println(array1.length);

		array[0]=-15;
		array[1]=7;
		array[2]=20;
		array[3]=1;
		array[4]=-22;
		array[5]=6;
		array[6]=40;


		shellSort(array);
		printArray(array);

	}
	public static int[] bubbleSort(int[] array){
		for(int j=0; j<array.length-2; j++){
			for(int i = 0; i<array.length-j-1; i++){
				if(array[i]>array[i+1]){
					int temp = array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		return array;
	}

	public static void printArray(int[] array){
		for(int i = 0; i<array.length; i++){
			System.out.println( i +" element of the array " + array[i]);
		}
	}

	public static int[] selectionSort(int[] array){


		for(int n=array.length-1; n>0; n--){
			int largest =0;
			for(int i=1; i<=n ; i++){
				if(array[i]>array[largest] ){
					largest=i;
				}

			}
			int temp = array[largest];
			array[largest]=array[n];
			array[n]= temp;
		}
		return array;
	}

	public static int[] insertionSort(int[] array){
		for(int firstUnsortedIndex=1; firstUnsortedIndex < array.length;firstUnsortedIndex++){
			int newElement = array[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex; i > 0 && array[i-1]>newElement ;i-- ){
				array[i]=array[i-1];
			}
			array[i]=newElement;


		}

		return array;

	}
	public static int[] insertionSort2(int[] array){
		for(int firstUnsortedIndex=1; firstUnsortedIndex < array.length;firstUnsortedIndex++){
			int newElement = array[firstUnsortedIndex];
			int i=firstUnsortedIndex-1;
			while(i>=0 && array[i]>newElement){
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=newElement;


		}

		return array;

	}

	public static int[] shellSort(int[] array){
		for(int gap = array.length/2; gap>0;gap /= 2){
			for(int i=gap; i<array.length;i++){
				int newElement=array[i];
				int j =i-gap;
				while(j>=0 && array[j]>newElement){
					array[j+gap]=array[j];
					j -=gap;
				}
				array[j+gap]=newElement;
			}
		}
		return array;
	}

}
