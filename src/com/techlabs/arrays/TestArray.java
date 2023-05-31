package com.techlabs.arrays;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int array[] = new int[n];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the elements of an array:");
		for(int i = 0; i<n; i++) {
			array[i]= scanner.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += array[i];
		}
		
		int average = sum/n;
		System.out.println("Sum: "+ sum);
		System.out.println("Average: "+ average);
	}

}
