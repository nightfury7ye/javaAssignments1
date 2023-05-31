package com.techlabs.arrays;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		System.out.println("enter No.s: ");
		int matrix[][] = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j]= scanner.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(matrix[i][j]+"\t");
			}
			System.out.println("");
		}
		scanner.close();
	}

}
