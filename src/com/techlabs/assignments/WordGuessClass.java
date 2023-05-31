package com.techlabs.assignments;

import java.util.Random;

public class WordGuessClass {
	private String RandomWords[] = {"elephant", "cricket", "mango", "laptop", "saree", "bicycle", "jungle", "monkey", "coconut", "temple", "bazaar", "cucumber", "festival", "rainbow", "chocolate", "elephant", "paradise", "cinnamon", "tradition", "meditation"};
	private String guessWord;
	
	public String getRandomWord() {
		Random random = new Random();
		guessWord = RandomWords[random.nextInt(20)];
		return guessWord;
	}
}
