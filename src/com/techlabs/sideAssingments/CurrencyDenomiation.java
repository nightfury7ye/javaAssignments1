package com.techlabs.sideAssingments;
import java.util.Scanner;
public class CurrencyDenomiation {

	public static void main(String[] args) {
		System.out.println("Enter withdrawal amount:");
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		if(amount>=50000)
		{
			System.out.println("Amount should be greater than 50000");
		}
		else if(amount % 100 != 0)
		{
			System.out.println("Amount should be in multiple of 100");
		}
		else
		{
			int []currency = {2000,500,200,100};
			int []notes = new int[4];
			
			for(int i = 0; i<currency.length; i++)
			{
				if(amount >= currency[i])
				{
					notes[i]= (amount/currency[i]);
					amount = amount % currency[i];
				}
			}
			
			for(int i = 0; i<currency.length; i++)
			{
				if(notes[i] != 0)
				{
					System.out.println("number of "+ currency[i] + " :" + notes[i]);
				}
			}
		}
		scanner.close();

}
}
