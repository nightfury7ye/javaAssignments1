package com.techlabs.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException  {
		FileInputStream fileStream=new FileInputStream("/Users/praveenvemula/Documents/Monocept/test1.txt");    
        int ch;    
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/praveenvemula/Documents/Monocept/test2.txt");
        while((ch=fileStream.read())!=-1){    
         	fileOutputStream.write(ch);
        }
        System.out.println("File copied successfully");
        fileStream.close();
        fileOutputStream.close();
	}

}
