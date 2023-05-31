package com.techlabs.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LineWordCountScanner {

	public static void main(String[] args) throws IOException {
		FileInputStream fileStream = new FileInputStream("/Users/praveenvemula/Documents/Monocept/test1.txt");    
        int wordCount = 0, lineCount = 0, charCount = 0;
        Scanner fileScanner = new Scanner(fileStream);
        while(fileScanner.hasNext()){
        	
        	lineCount++;
             String[] words = fileScanner.nextLine().split("\\s+");
             System.out.println(words.length);
             wordCount += words.length;
            for (String word : words)
            { 
                charCount += word.length();
            }
        }
        System.out.println("word count: "+ wordCount + " line count: "+ lineCount + " char count: "+ charCount);
        fileStream.close();
        fileScanner.close();

	}

}
