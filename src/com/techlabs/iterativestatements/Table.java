package com.techlabs.iterativestatements;


public class Table {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			for(int j = 0; j<=10; j++) {
				System.out.println(i + "*"+ j + " = "+ i*j);
			}
			System.out.println("\n");
		}

	}

}
