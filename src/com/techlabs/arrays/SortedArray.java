package com.techlabs.arrays;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int array[] = new int[n];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the elements of an array:");
		for(int i = 0; i<n; i++) {
			array[i]= scanner.nextInt();
		}
		
		int temp;
		System.out.println("test");
	    for(int i = 0; i < n - 1; i++) {
	    	for(int j = 0; j < n - i - 1; j++) {
	    		System.out.println("test");
	            if (array[j] > array[j + 1]) {
	            	temp = array[j];
	            	array[j] = array[j + 1];
	            	array[j] = temp;
	            	System.out.println("test");
	            }
	    	}
	    }
	    for(int i = 0; i<n; i++) {
	    	System.out.println(array[i]);
		}

	}

}
