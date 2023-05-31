package com.techlabs.arrays;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);;
		int matrix1[][] = new int[m][n];
		int matrix2[][] = new int[m][n];
		int matrix3[][] = new int[m][n];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter No.s for matrix1: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matrix1[i][j]= scanner.nextInt();
			}
		}
		System.out.println("enter No.s for matrix2: ");	
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matrix2[i][j]= scanner.nextInt();
			}
		}
		
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matrix3[i][j]= matrix1[i][j] + matrix2[i][j];
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.println(matrix3[i][j]+"\t");
			}
			System.out.println("");
		}
		scanner.close();
	}

}
