package com.sc.assessment.controller;


public class SearchItem {

	private static int[] listOfPrime = new int[10];
	static {
		listOfPrime[0] = 1;
		listOfPrime[1] = 34;
		listOfPrime[2] = 42;
		listOfPrime[3] = 54;
		listOfPrime[4] = 65;
		listOfPrime[5] = 75;
		listOfPrime[6] = 86;
	}

	public int searchItem (int val) {	
		return iterateArray(listOfPrime, 0, listOfPrime.length, val);
	}
	
	private int iterateArray(int[] listOfPrime, int startIndex, int endIndex, int val) {
		System.out.println("startIndex : "+ startIndex + " endIndex : "+ endIndex + " value : "+ val);
		if (startIndex == endIndex) {
			return startIndex;
		}
		if (listOfPrime[endIndex/2] > val) {
			endIndex = endIndex/2;	
		} else {
			startIndex = endIndex/2;
		}
		return iterateArray(listOfPrime, startIndex, endIndex, val);
	}
	
}
