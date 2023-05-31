package com.techlabs.assignments;

import java.util.Random;
import java.util.Scanner;

public class BookCricket {

	public static void main(String[] args) {
		System.out.println("Welcome To Book Cricket");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of 1st Player: ");
		String player1 = scanner.nextLine();
		System.out.println("Enter the name of 2st Player: ");
		String player2 = scanner.nextLine();
		Random random = new Random();
		int answer;
		int rand;
		int score = 1, totalScore1 = 0, totalScore2 = 0, turn1 = 0, turn2 = 0; 
		System.out.println("Player "+player1);
		while(score != 0) {
			System.out.println("Type 0 to random pg number: ");
			answer = scanner.nextInt();
			if(answer == 0) {
				turn1++;
				rand = random.nextInt(301);
				System.out.println("Page no: " + rand);
				score = rand%7;
				if(score != 0) {
					totalScore1 += score;
					System.out.println("score: " + score +"\n");
				}
				else {
					System.out.println("Total Score: "+ totalScore1);
					System.out.println("Game Over as score: "+ score +"\n");
				}
			}
		}
		
		
		System.out.println("Player "+player2);
		score = 1;
		while(score != 0) {
			System.out.println("Type 0 to random pg number: ");
			answer = scanner.nextInt();
			if(answer == 0) {
				turn2++;
				rand = random.nextInt(301);
				System.out.println("Page no: " + rand);
				score = rand%7;
				if(score != 0) {
					totalScore2 += score;
					System.out.println("score: " + score +"\n");
				}
				else {
					System.out.println("Total Score: "+ totalScore2);
					System.out.println("Game Over as score: "+ score +"\n");
					break;
				}
			}
		}
		
		if(totalScore1 < totalScore2) {
			System.out.println(player2 +" Won the match");
		}
		else if (totalScore1 > totalScore2) {
			System.out.println(player1 +" Won the match");
		}
		else {
			if(turn1 < turn2) {
				System.out.println(player2 +" Won the match");
			}
			else if (turn1 > turn2) {
				System.out.println(player1 +" Won the match");
			}
			else {
				System.out.println("Its a Tie");
			}
		}
		

	}

}
