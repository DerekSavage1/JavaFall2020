/*
	Derek Savage
	1086695
	ds1086695@swccd.edu
	Assignment#04
*/

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
			
	//Asking user for a max number
	Scanner input = new Scanner(System.in);
	int positiveMaxNumber;
	do {
		 System.out.print("Please enter positive max. number: ");
		 positiveMaxNumber = input.nextInt();
	} while (positiveMaxNumber < 0);
	System.out.println();
	input.close();	 
	 
	 //Top part of frame
	 System.out.printf("%5s", "");
	 for(int j=0; j<=positiveMaxNumber; j++) {
		 System.out.printf("%5d", j);
	 }
	 
	 System.out.println();
	 System.out.print("-----");
	 for(int j=0; j<=positiveMaxNumber; j++) {
		 System.out.print("-----");
	 }
	 System.out.println();
	 
	 
	 //inside of the table
	 for(int x=0; x<=positiveMaxNumber; x++) {
		 //left part of frame
		 System.out.printf("%3d |", x);
		 
		 for(int y=0; y<=positiveMaxNumber; y++) {
			 int write = positiveMaxNumber;
			 
			 //specified eliminations
			 if(y>=Math.abs(x-write)) {
				 System.out.printf("%5s", x*y);
				 write++;
			 } else {
				 System.out.printf("%5s", "");
			 }
		 }
		 System.out.println();
	 }
	}
}
