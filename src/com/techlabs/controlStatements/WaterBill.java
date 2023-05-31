package com.techlabs.controlStatements;

//import java.util.Scanner;

public class WaterBill {

	public static void main(String[] args) {
		int units = Integer.parseInt(args[0]);
		int meterCharge = 75;
		int totalCharge;
		
		if(units <= 100)
			totalCharge = units*5;
		else if (units <=250)
			totalCharge = units*10;
		else 
			totalCharge = units*10;
		
		totalCharge += meterCharge;
		
		System.out.println("Total water bill:"+ totalCharge);

	}

}
