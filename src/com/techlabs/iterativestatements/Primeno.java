package com.techlabs.iterativestatements;
public class Primeno {

	public static void main(String[] args) {
		int i,count, j;
	      System.out.print("Prime numbers between 1 to 100 are ");
	      for(j=2;j<=100;j++){
	         count=0;
	         for(i=2;i<=j/2;i++){
	            if(j%i==0){
	               count++;
	            }
	         }
	         if(count==0)
	         System.out.print(j+" ");
	      }
	}

}
