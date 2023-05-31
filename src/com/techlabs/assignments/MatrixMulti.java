package com.techlabs.assignments;
import java.util.Scanner;

public class MatrixMulti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. rows of Matrix 1: ");
		int m1 = scanner.nextInt();
		System.out.println("Enter no. columns of Matrix 1: ");
		int n1 = scanner.nextInt();
		System.out.println("Enter no. rows of Matrix 2: ");
		int m2 = scanner.nextInt();
		System.out.println("Enter no. columns of Matrix 2: ");
		int n2 = scanner.nextInt();
		int matrix1[][] = new int[m1][n1];
		int matrix2[][] = new int[m2][n2];
		
		
		
		System.out.println("enter No.s for matrix1: ");
		for(int i=0; i<m1; i++) {
			for(int j=0; j<n1; j++) {
				matrix1[i][j]= scanner.nextInt();
			}
		}
		System.out.println("enter No.s for matrix2: ");	
		for(int i=0; i<m2; i++) {
			for(int j=0; j<n2; j++) {
				matrix2[i][j]= scanner.nextInt();
			}
		}
		
		if(n1 == m2) {
			int matrix3[][] = new int[m1][n2];
			for(int i=0; i<m1; i++) {
				for(int j=0; j<n2; j++) {
					int sum = 0;
					for(int k=0; k<n1; k++) {
						sum += matrix1[i][k] * matrix2[k][j];
					}
					matrix3[i][j] = sum;
				}
			}
			
			for(int i=0; i<m1; i++) {
				for(int j=0; j<n2; j++) {
					System.out.print(matrix3[i][j]+"\t");
				}
				System.out.println("");
			}
		}
		
		scanner.close();
	}

}
