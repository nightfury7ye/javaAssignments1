package com.techlabs.assignments;
import java.util.Random;
import java.util.Scanner;

public class PIGDiceGame {

	public static void main(String[] args) {
		System.out.println("Welcome to PIG Dice Roll Game!");
		OneTurn(1, 0);
		
	}

	private static void OneTurn(int turn, int total) {
		String answer;
		int savedTotal = total;
		boolean end = false;
		PIGClass PIGobj = new PIGClass(turn, total, end);
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Turn "+ turn);
//		System.out.println("TURN NO. "+ turn);
		while(!end) {
			end = false;
			System.out.println("Roll or hold? press (r/h):");
			answer = scanner.nextLine();
			optionParser(savedTotal,answer,random, PIGobj);
			
		}
		OneTurn(turn, total);
		return;
	}

	private static void optionParser(int savedTotal, String answer, Random random, PIGClass PigObj) {
		if(answer.equals("r")) {
			int diceNo = random.nextInt(6) + 1;
			PigObj.setTotal(PigObj.getTotal() + diceNo);
			System.out.println("Die: " + diceNo);
			checkDiceNo(diceNo,savedTotal, PigObj);
			
		}
		else if(answer.equals("h")) {
			System.out.println("Your Score is "+ PigObj.getTotal() + "\n");
			PigObj.setTurn(PigObj.getTurn() + 1);
			PigObj.setEnd(true);
		}
		
	}

	private static void checkDiceNo(int diceNo, int savedTotal,PIGClass PigObj) {
		if(diceNo == 1) {
			PigObj.setTotal(savedTotal);
			System.out.println("Turn over. Score reset to "+ savedTotal + "\n");
			PigObj.setTurn(PigObj.getTurn() + 1);
			PigObj.setEnd(true);
		}
		else if(PigObj.getTotal() >= 20) {
			System.out.println("You finished in "+ PigObj.getTurn() +" turns!");
			System.exit(0);
		}
		else {
			System.out.println("Your Score is "+ PigObj.getTotal());
		}
		
	}

}
