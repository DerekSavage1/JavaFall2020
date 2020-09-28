import java.util.Scanner;

public class ExchangeCAD 
{
	public static void main(String args[]) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a maximum exchange USD amount:");
		int maximumExchangeAmmont = input.nextInt();
		if (maximumExchangeAmmont < 0) 
		{
			//Can not have negative money
			System.out.println("Can't input a negative value!\nShutting Down...");
			System.exit(0);
		}
		
		System.out.print("\nPlease enter a decimal USD amount for exchange:");
		double USDDecimal = input.nextDouble();
		if (USDDecimal < 0) 
		{
			//Can not have negative money
			System.out.println("Can't input a negative value!\nShutting Down...");
			System.exit(0);
		}
		
		double exchangeRate = 1.3170;
		double exceedingAmmountUSD = maximumExchangeAmmont - USDDecimal;

		if(exceedingAmmountUSD>0)
		{
			exceedingAmmountUSD = 0;
		} 
		else 
		{
			exceedingAmmountUSD = Math.abs(exceedingAmmountUSD);	
		}
		double CADDecimal = ((USDDecimal-exceedingAmmountUSD) * exchangeRate);
		double totalExchangeAmountCAD = (CADDecimal);
		
		//Calculate dollars
		int CADThousands = (int) CADDecimal/1000;
		CADDecimal = (CADDecimal-(CADThousands*1000));
		int CADHundreds = (int) CADDecimal/100;
		CADDecimal = (CADDecimal-CADHundreds*100);
		int CADFifties = (int) CADDecimal/50;
		CADDecimal = (CADDecimal-CADFifties*50);
		int CADTwenties = (int) CADDecimal/20;
		CADDecimal = (CADDecimal-CADTwenties*20);
		int CADTens = (int) CADDecimal/10;
		CADDecimal = (CADDecimal-(CADTens*10));
		int CADFives = (int) CADDecimal/5;
		CADDecimal = (CADDecimal-(CADFives*5));
		int CADTwos = (int) CADDecimal/2;
		CADDecimal = (CADDecimal-(CADTwos*2));
		int CADOnes = (int) CADDecimal;
		CADDecimal = (CADDecimal-CADOnes);
		
		//Calculate Change
		double CADChange = CADDecimal * 100;
		
		int CADQuarters = (int) (CADChange/25);
		CADChange = (CADChange-(CADQuarters*25));
		int CADDimes = (int) (CADChange/10);
		CADChange = (CADChange-(CADDimes*10));
		int CADNickels = (int) (CADChange/5);
		CADChange = (CADChange-(CADNickels*5));
		int CADPennies = (int) (CADChange*1);
		CADChange = (CADChange-(CADPennies/1));
		
		//print calculations
		System.out.println("Paper currency CAD$:");
		System.out.println("Number of CAD$1000: "+CADThousands);
		System.out.println("Number of CAD$100: "+CADHundreds);
		System.out.println("Number of CAD$50: "+CADFifties);
		System.out.println("Number of CAD$10: "+CADTwenties);
		System.out.println("Number of CAD$10: "+CADTens);
		System.out.println("Number of CAD$5: "+CADFives);
		System.out.println("Number of CAD$2: "+CADTwos);
		System.out.println("Number of CAD$1: "+CADOnes+"\n");
		
		System.out.println("Coin currency CAD$:");
		System.out.println("Number of CAD$0.25: "+CADQuarters);
		System.out.println("Number of CAD$0.10: "+CADDimes);
		System.out.println("Number of CAD$0.05: "+CADNickels);
		System.out.println("Number of CAD$0.01: "+CADPennies +"\n");
		
		System.out.print("Total exchange amount CAD$: ");
		System.out.printf("%.2f \n", +totalExchangeAmountCAD);
		System.out.print("Exceeding amount USD$: ");
		System.out.printf("%.2f \n", +exceedingAmmountUSD);
		
		
		input.close();
	}
}
