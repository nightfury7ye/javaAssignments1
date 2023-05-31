package com.techlabs.controlStatements;

import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
		System.out.println("Welcome to the Treasure Island");
		Scanner scanner = new Scanner(System.in);
		String userOption = "";
		System.out.println("Choose left or right:");
		userOption = scanner.nextLine();
		
		if(!userOption.equals("left"))
		{
			System.out.println("Fall into the Hole");
			System.exit(0);
		}
		
		System.out.println("Choose swim or wait:");
		userOption = scanner.nextLine();
		
		if(!userOption.equals("wait"))
		{
			System.out.println("Fall into the Hole");
			System.exit(0);
		}
		
		System.out.println("which door color you will choose yellow,blue,red:");
		userOption = scanner.nextLine();
		
		if(userOption.equals("yellow"))
			System.out.println("You win");
		else if(userOption.equals("red"))
			System.out.println("Burn by Fire");
		else if(userOption.equals("blue"))
			System.out.println("Eaten by the Beast");
		else
			System.out.println("gave over");
		
		scanner.close();
	}

}
