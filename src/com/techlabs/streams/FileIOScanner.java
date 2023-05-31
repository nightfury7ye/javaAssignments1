package com.techlabs.streams;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOScanner {

	public static void main(String[] args) throws IOException {
		FileInputStream fileStream=new FileInputStream("/Users/praveenvemula/Documents/Monocept/test1.txt");
		BufferedWriter fileOutput = new BufferedWriter(new FileWriter("/Users/praveenvemula/Documents/Monocept/ScannerTestFile.txt"));
        Scanner fileScanner = new Scanner(fileStream);
        while(fileScanner.hasNext()) {
            fileOutput.write(fileScanner.nextLine());
            fileOutput.newLine();
         }
        System.out.println("File copied successfully");
        fileStream.close();
        fileOutput.close();
        fileScanner.close();
	}

}
