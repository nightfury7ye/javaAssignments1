package com.techlabs.assignments;
import java.util.Scanner;

public class RideBillCalculators {

	public static void main(String[] args) {
		System.out.println("Enter your Height in cm: ");
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextInt();
		if(height < 120){
			System.out.println("Sorry You can't Ride");
			System.exit(0);
		}
		System.out.println("Enter your Age: ");
		int age = scanner.nextInt();
		int bill = 0;
		if(age < 12) {
			bill = 400;
		}
		else if(age>=12 && age<18) {
			bill = 580;
		}
		else if(age>=45 && age<=55) {
			bill = 0;
		}
		else {
			bill = 1000;
		}
		System.out.println("Do you want photos: ");
		scanner.nextLine();
		String photo = scanner.nextLine();
		if(photo.equals("yes")) {
			bill += 250;
		}
		System.out.println("Total bill is rs"+ bill);
		scanner.close();
	}

}
