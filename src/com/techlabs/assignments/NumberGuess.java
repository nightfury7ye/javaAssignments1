package com.techlabs.assignments;
import java.util.Scanner;
import java.util.Random;
public class NumberGuess {

	public static void main(String[] args) {
		game();
	}

	private static void game() {
		System.out.println("Welcome to the word generation Game");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("Random No.: "+ randomNumber);
		System.out.println("Random No. is generated you have 10 Guesses: ");
		int i;
		for(i = 0; i < 10; i++) {
			String value = scanner.nextLine();
			if(value.equals("exit")) {
				System.exit(0);
			}
			else {
				int guess = Integer.parseInt(value);
				
				if(guess == randomNumber) {
					scanner.nextLine();
					System.out.println("Your guess was right You WON the game "+ "In " + (i + 1) + " chances "
							+ "Do you want to play the game again? type yes or no");
					String ans = scanner.nextLine();
					if(ans.equals("yes")) {
						game();
					}
					else {
						System.exit(0);
					}
				}
				else if(guess < randomNumber - 10) {
					System.out.println("Guess is too low");
				}
				else if(guess > randomNumber + 10) {
					System.out.println("Guess is too high");
				}
				else if(guess >= randomNumber - 10 && guess < randomNumber) {
					System.out.println("Guess is low but nearby");
				}
				else if(guess <= randomNumber + 10 && guess > randomNumber) {
					System.out.println("Guess is high but nearby");
				}
			}
		}
		
		System.out.println("Game Over! Sorry Your Changes are over.");
		System.out.println("Do you want to play the game again? type yes or no: ");
		scanner.nextLine();
		String ans = scanner.nextLine();
		if(ans.equals("yes")) {
			game();
		}
		else {
			System.exit(0);
		}
		scanner.close();
	}
}
