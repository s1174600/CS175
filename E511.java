package ch6;

import java.util.Scanner;

public class E511 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter temperature value: ");
		double x = in.nextDouble();
		
		System.out.println("Please enter C for Celcius or F for Fahrenheit: ");
		String y = in.next();
		
		if(y.equals("F") & ((x > 32) & (x < 212))) {
			System.out.println("liquid");
		}
		else if(y.equals("F") & (x <= 32)) {
			System.out.println("solid");
		}
		else if(y.equals("F") & (x >= 212)) {
			System.out.println("gaseous");
		}
		else if(y.equals("C") & (x > 0) & (x < 100)) {
			System.out.println("liquid");
		}
		else if(y.equals("C") & (x <= 0)) {
			System.out.println("solid");
		}
		else if(y.equals("C") & (x >=100)) {
			System.out.println("gaseous");
		}
		
		
			
		
		
		

	}

}
