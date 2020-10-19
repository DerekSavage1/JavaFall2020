/*
 * Derek Savage
 * 1086695
 * ds1086695@swccd.edu
 * Assignment#05
 */

import java.util.Scanner;

public class TicketSale {
	
	public static void main(String[] args) {
		
		//Requesting Number of adults and children from user.
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter number of adults:");
		int numAdults = input.nextInt();
		System.out.printf("Please enter number of kids:");
		int numKids = input.nextInt();
		input.close();
		
		//Calling methods to calculate cost and plurals.
		double cost = ticketCost(numAdults, numKids);
		String adultWord = adultPlural(numAdults);
		String kidWord = kidPlural(numKids);

		System.out.printf("Your total cost for %d %s and %d %s is: %.2f", numAdults, adultWord, numKids, kidWord, cost);

	}
	
	//
	public static double ticketCost(int numAdults,int numKids) {
		
		double adultTicketCost = numAdults * 15;
		double kidTicketCost;
		
		if(numKids <= numAdults) {
			//Every Adult can buy a kid a ticket.
			kidTicketCost = (numKids * 5);
		} else {
			//Adults can purchase a kids ticket for 5.00 and the rest of the kids tickets cost 7.50
			numKids = numKids-numAdults;
			kidTicketCost = (numKids * 7.5) + numAdults*5;
		}
		
		double totalCost = (adultTicketCost + kidTicketCost);
		
		//5% off for orders of 10 or more tickets
		if((numAdults + numKids) >= 10) {
		totalCost = totalCost * .95;
		}
		
		return totalCost;
		
	}
	
	public static String adultPlural(int numAdults) {
		if (numAdults > 1) {
			String adultWord = "adults";
			return adultWord;
		} else {
			String adultWord = "adult";
			return adultWord;
		}
	}
	
	public static String kidPlural(int numKids) {
		if (numKids > 1) {
			String kidWord = "children";
			return kidWord;
		} else {
			String kidWord = "child";
			return kidWord;
		}
	}

}

