import java.util.Scanner;

public class E410 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of gallons of gas in the tank: ");
		double x = in.nextDouble();
				
		System.out.print("Enter the fuel efficiency in miles per gallon: ");
		double y = in.nextDouble();
				
		System.out.print("Enter the price of gas per gallon: ");
		double z = in.nextDouble();
		
		double a = (z*100);
		double b = (x*y);
		
		System.out.println("The cost per 100 miles is " + a);
		System.out.println("The car can go " + b + " miles with the gas in the tank");
		

				 
			}
		

	}


