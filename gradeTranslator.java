import java.util.Scanner;


public class gradeTranslator 
{

	public static void main(String[] args) 
	{
		
		//Requesting user's score
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your score: ");
		int score = input.nextInt();
		input.close();
		
		//Calculating Grade
		boolean passing = false;
		char grade = 0;
		if(score >= 90)
		{
			grade ='A';
			passing = true;
		} 
		else if(score >= 80)
		{
			grade ='B';
			passing = true;
		}
		else if (score >= 70)
		{
			grade ='C';
			passing = true;
		}
		else if (score >= 60)
		{
			grade ='D';
			passing = false;
		}
		else if (score < 60)
		{
			grade ='F';
			passing = false;
		}

		// This message could be hard-coded into the if statements but I figured this is easier to modify later.
		String passingMsg; 
		if(passing == true)
		{
			passingMsg = "PASSED";
		} else
		{
			passingMsg = "NOT PASSED";
		}
		
		System.out.println("Your grade is " + grade + " and is " + passingMsg);
		
		

	}

}
