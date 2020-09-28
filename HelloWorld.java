/*
	Derek Savage
	ds1086695@swccd.edu
*/

public class HelloWorld 
{	
	
	static String name = "Derek Savage";
	static int age = 19;
	static double annualPay = 50000.00;
	static double payIncrease = 10000.00;
	static double annualPayAfterIncrease = annualPay + payIncrease;
	static float myChanges = 10;
	
	public static void main(String[] args) 
	{
		//Printing my name and age
		System.out.println("My name is " + name + ", my age is " + age + "\n");
		
		//Printing how much change is in my wallet
		System.out.println("I have $" + myChanges + " in my wallet.\n");
		
		//Printing how much I hope to earn before and after a pay increase
		System.out.print("I hope to earn $" + annualPay + " in my first year");
		System.out.println(" and to earn $" + annualPayAfterIncrease + " after my pay increase.");
	}

}
