package com.java.test;

public class WhyMethod {

	public static void main(String[] args) {
		int[] productPrices = {100, 200, 300, 400, 500, 600};
		int[] cricketScores = {90, 30, 50, 70, 10, 80, 20, 40};
		int[] covidCases = {423564, 546378, 235467, 908746, 267839, 783659};
		
//		int maxPrice = productPrices[0];
//		int maxScores = cricketScores[0];
//		int maxCases = covidCases[0];
//		
//		printMaxValue(productPrices, maxPrice);
//		printMaxValue(cricketScores, maxScores);
//		printMaxValue(covidCases, maxCases);
		
		int maxPrice = getMaxValue(productPrices);
		int maxScore = getMaxValue(cricketScores);
		int maxCases = getMaxValue(covidCases);
		
		System.out.println("Max Price: " + maxPrice);
		System.out.println("Max Score: " + maxScore);
		System.out.println("Max Covid Cases: " + maxCases);
	}
	
	// David
	public static void getMaxValue(int[] comparedArray, int currentMax){
		for(int idx = 1; idx < comparedArray.length; idx++) {
			if(comparedArray[idx] > currentMax) {
				currentMax = comparedArray[idx];
			}
		}
		
		System.out.println("Max price in product prices array: " + currentMax);
}
 
	// Joseph
	public static int getMaxValue(int[] array) {
		
		int maxValue = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
