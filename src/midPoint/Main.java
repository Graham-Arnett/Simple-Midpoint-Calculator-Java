package midPoint;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Welcome to the midpoint calculator app!");
		String choice;
				do 
		{
		System.out.print("\nPlease enter your x1 value: ");
		double xOne = scanner.nextDouble();
		
		System.out.print("\nPlease enter your x2 value: ");
		double xTwo = scanner.nextDouble();
		
		System.out.print("\nPlease enter your y1 value: ");
		double yOne = scanner.nextDouble();
		
		System.out.print("\nPlease enter your y2 value: ");
		double yTwo = scanner.nextDouble();
		
		double xNumerator = (xOne + xTwo)/2;
		
		double yNumerator = (yOne + yTwo)/2;
		
		System.out.println("The midpoint on a coordinate plane is: (" + xNumerator + ", " + yNumerator + ")");
					
		System.out.print("Would you like to go again? (y/n): ");
		choice = scanner.next();	
		}while(choice.equals("y"));
	}

}