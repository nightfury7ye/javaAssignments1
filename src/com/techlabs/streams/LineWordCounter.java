package com.techlabs.streams;

import java.io.FileInputStream;
import java.io.IOException;

public class LineWordCounter {

	public static void main(String[] args) throws IOException {
		FileInputStream fileStream=new FileInputStream("/Users/praveenvemula/Documents/Monocept/test1.txt");    
        int ch;
        int wordCount = 1, lineCount = 1, charCount = 0;
        int prevCH = fileStream.read();
        System.out.println("prevCH " + (char)prevCH);
        while((ch=fileStream.read())!=-1){
        	charCount++;
        	if(((char)ch == '\t' || (char)ch == ' ' || (char)ch == '\n') && (char)ch != (char)prevCH ) {
        		wordCount++;
        		System.out.println("prevCH " + (char)prevCH + " charCh "+ (char)ch);
        	}
        	prevCH = ch;
        	if((char)ch == '\n' ) {
        		lineCount++;
        	}
        }
        System.out.println("word count: "+ wordCount + " line count: "+ lineCount + " char count: "+ charCount);
        fileStream.close();

	}

}
