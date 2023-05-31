package com.techlabs.assignments;

import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class GuessWord {

	public static void main(String[] args) {
		WordGuessClass wordGuessClass = new WordGuessClass();
		String guessWord = wordGuessClass.getRandomWord();
//		char[] guessWordArr = GuessWord.toCharArray();
		
		char[] guessWordArr = new char[guessWord.length()];
		createGuessWordArr(guessWordArr, guessWord);
		int n = guessWord.length();
		int lifes = n*2;
		char fillupString[] = new char[n];
		for(int i = 0; i< fillupString.length; i++) {
			fillupString[i] = '_';
		}
		System.out.println(guessWord);
		startGame(fillupString, guessWordArr,lifes);
		
		
	}

	private static void startGame(char[] fillupString, char[] guessWordArr, int lifes) {
		System.out.println("Random word is generated you will have "+ lifes+" lifes to guess the word");
		boolean end = false;
		for(int i = 0; i< guessWordArr.length; i++) {
			lifes = guessCurrentLetter(fillupString,guessWordArr,lifes,end, i);
		}
		System.out.println("Yeah! You won the Game");
		
	}

	private static int guessCurrentLetter(char[] fillupString, char[] guessWordArr, int lifes, boolean end, int i) {
		Scanner scanner = new Scanner(System.in);
		while(end == false) {
			System.out.print("Guess this word  ");
			printFillupArray(fillupString);
			System.out.println("Guess "+(i+1)+"th letter \t \t"+"Lifes left: "+ lifes);
			char letter = scanner.next().charAt(0);
			end = checkGuess(letter, guessWordArr[i], lifes, i, fillupString);
			lifes = decreaseLife(lifes, end, i, guessWordArr);
			gameOverCheck(lifes);
		}
		return lifes;
		
	}

	private static void gameOverCheck(int lifes) {
		if(lifes == 0) {
			System.out.println("oh oh! Ran out of lifes Game over");
			System.exit(0);
		}
		
	}

	private static int decreaseLife(int lifes, boolean end, int i, char[] guessWordArr) {
		if(end == false) {
			return --lifes;
		}
		else if(end == true && i != guessWordArr.length - 1){
			System.out.println("Yeah! Guess was right, now its guess "+ (i+1) +"th letter");
			return lifes;
		}
		return lifes;
	}

	private static boolean checkGuess(char letter, char ch, int lifes, int i, char[] fillupString) {
		if(letter == ch) {
			fillupString[i] = ch;
			return true;
		}
		System.out.println("Sorry your guess was wrong, guess again");
		lifes--;
		return false;
	}

	private static void printFillupArray(char[] fillupString) {
		for (char c : fillupString) {
		    System.out.print(c+" ");
		}
		
	}

	private static void createGuessWordArr(char[] guessWordArr, String guessWord) {
		for (int i = 0; i < guessWord.length(); i++) {
			guessWordArr[i] = guessWord.charAt(i);
		}
		
	}

}
