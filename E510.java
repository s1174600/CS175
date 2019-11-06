package ch6;

import java.util.Scanner;

public class E510 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter name of employee: ");
		String x = in.next();
		
		System.out.println("Please enter " + x + "'s salary: ");
		double y = in.nextDouble();
		
		System.out.println("Please enter the amount of hours " + x + " worked in the past week: ");
		double z = in.nextDouble();
		
		if(z > 40) {
			System.out.println("How many hours of overtime did " + x + " work in the past week: ");
			double a = in.nextDouble();
			double b = (y*z) + ((y*1.5)*a); 
			System.out.println("Paycheck: $" + b);
		}
		else {
			double b = (y*z);
			System.out.println("Paycheck: $" + b);
		}
		
		
		

	}

}
