/*
 * Derek Savage
 * 1086695
 * 1086695@swccd.edu
 * Assignment#06
 */

import java.util.Scanner;

public class NumberArray {

	public static void main(String[] args) {
		
		//Asking user to enter a size of an array and to fill it with integers
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the size of array:");
		int arraySize = input.nextInt();
		int[] myArray = new int[arraySize];
		
		for(int j = 0; j<arraySize; j++) {
			System.out.printf("Please enter an integer:");
			int arrayValue = input.nextInt();
 	 		myArray[j] = arrayValue;
		}
		
		//Calling methods to calculate extrema, average and sum
		printArray(myArray);
		int arraySum = getTotal(myArray);
		double arrayAverage = getAverage(myArray);
		int highestValue = getHighest(myArray);
		int lowestValue = getLowest(myArray);
		
		//Printing report of calculations from methods
		System.out.printf("The sum of all the elements in the array is: %d\n",arraySum);
		System.out.printf("The average of all the elements in the array is: %.2f\n", arrayAverage);
		System.out.printf("The max of all the elements in the array is %d\n", highestValue);
		System.out.printf("The min of all the elements in the array is: %d\n\n", lowestValue);
		
		System.out.printf("What value you would like to be removed:");
		int removalValue = input.nextInt();
		input.close();
		
		//Calling methods for number of removed values and generating a new array without those values
		int removalOccurrences = countOcccurrences(myArray,removalValue);
		int[] arrayAfterRemoval = removeAll(myArray,removalValue);
		
		//Printing new array and number of value removals
		System.out.printf("The number of occurrences of %d in the array is: %d\n\n", removalValue, removalOccurrences);
		System.out.printf("Here is a printout of the new array with number %d removed:\n", removalValue);
		printArray(arrayAfterRemoval);


	}
	
	//Prints numbers in array 6 times before creating a new line
	public static void printArray(int[] myArray) {
		for(int j = 0; j < myArray.length; j++) {
			if(j%6==0 && j!=0) {
		    System.out.printf("\n   " + myArray[j]);
		   } else {
			System.out.printf("   " + myArray[j]);
		   }
		}
		System.out.printf("\n");
	}
	
	public static int getTotal(int[] myArray) {
		int sum = 0;
		for(int j = 0; j<myArray.length ;j++) {
			sum = sum + myArray[j] ;
		}
		return sum;
	}
	
	public static double getAverage(int[] myArray) {
		double average = 0.0;
		int sum = 0;
		
		for(int j = 0; j<myArray.length ;j++) {
			sum = sum + myArray[j] ;
		}
		
		average = (double)sum/myArray.length;
		return average;
	}
	
	public static int getHighest(int[] myArray) {
		int highest = myArray[0];
		for (int j = 0; j < myArray.length; j++) {
			if(highest < myArray[j]) {
				highest = myArray[j];
			}
		}
		return highest;
	}
	
	public static int getLowest(int[] myArray) {
		int lowest = myArray[0];
		for (int j = 0; j > myArray.length; j++) {
			if(lowest > myArray[j]) {
				lowest = myArray[j];
			}
		}
		return lowest;
	}
	
	public static int countOcccurrences(int[] myArray, int removalValue) {
		int occurances = 0;
		for(int j=0;j<myArray.length;j++) {
			if(removalValue == myArray[j]) {
				occurances++;
			}
		}
		return occurances;
	}
	
	public static int[] removeAll(int[] myArray, int removalValue) {
		
		//finding occurances for new array length
		int occurances = 0;
		for(int j=0;j<myArray.length;j++) {
			if(removalValue == myArray[j]) {
				occurances++;
			}
		}
		
		int[] newArray = new int[myArray.length-occurances];
		int temp = 0;
		for(int j=0;j<myArray.length;j++) {
			if(myArray[j] != removalValue) {
				newArray[temp] = myArray[j];
				temp++;
			}
		}
		return newArray;
	}

}
