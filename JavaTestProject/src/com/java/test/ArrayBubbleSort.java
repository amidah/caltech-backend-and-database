package com.java.test;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		int[] ages = {10, 12, 34, 54, 42, 89, 9, 7, 75, 33};
		printArray(ages);
		bubbleSort(ages);
		printArray(ages);
		
	}
	
	static void bubbleSort(int[] array) {
		int length = array.length;
		for(int i=0; i < length-1; i++) {
			for(int j=0; j<length-i-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	static void printArray(int[] array) {
		for(int i=0 ; i<array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	
}
