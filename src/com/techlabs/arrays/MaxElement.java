package com.techlabs.arrays;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int array[] = new int[n];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the elements of an array:");
		for(int i = 0; i<n; i++) {
			array[i]= scanner.nextInt();
		}
		
		int max = 0;
		int secondlargest = 0;
		int i, j;
	    for (i = 0; i < n - 1; i++) {
	    	for (j = 1; j < n - 1; j++) {
	            if (array[i] > array[j]) {
	            	
	            }
	    	}
	    }
	    for(i = 0; i<n; i++) {
	    	System.out.println(array[i]+ "\n");
		}


	}

}
