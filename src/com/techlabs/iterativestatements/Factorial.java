package com.techlabs.iterativestatements;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no. for factorial:");
		int number = scanner.nextInt();
		int i = number;
		int fact = 1;
		while(i>1) {
			fact *= i;
			i--;
		}
		System.out.println("Factorial of "+ number + " is: " + fact);
		scanner.close();
	}

}
