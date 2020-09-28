import java.util.Scanner;

public class myRectangles {

	public static void main(String[] args) {
		//Requesting user's score
		Scanner input = new Scanner(System.in);
				System.out.print("First: Please enter a width: ");
				double width1 = input.nextDouble();
				System.out.print("First: Please enter a height: ");
				double height1 = input.nextDouble();
				System.out.print("Second: Please enter a width: ");
				double width2 = input.nextDouble();
				System.out.print("Second: Please enter a height: ");
				double height2 = input.nextDouble();
				System.out.println();
				input.close();
				
				double area1 = height1 * width1;
				double area2 = height2 * width2;
				double perimeter1 = 2*height1 + 2*width1;
				double perimeter2 = 2*height2 + 2*width2;
				double averageArea = (area1 + area2)/2;
				double averagePerimeter = (perimeter1 + perimeter2)/2;;
				
				
				System.out.printf("First rectangle (%d, %d) has area = %.2f, and perimeter = %.2f\n",Math.round(width1),Math.round(height1),area1,perimeter1);
				System.out.printf("Second rectangle (%d, %d) has area = %.2f, and perimeter = %.2f\n\n",Math.round(width2),Math.round(height2),area2,perimeter2);
				
				System.out.printf("Average area is %.2f and average perimeter is %.2f", averageArea, averagePerimeter);

	}

}
