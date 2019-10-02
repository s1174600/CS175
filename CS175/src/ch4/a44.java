package ch4;

import java.util.Scanner;

public class a44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyIn = new Scanner(System.in);
		int value1, value2;
		
		System.out.println("Please enter a first integer: ");
		
		value1 = keyIn.nextInt();
		
		System.out.println("Please enter a second integer: ");
		
		value2 = keyIn.nextInt();
		
		int sum = value1 + value2;
		
		System.out.println("sum: " + sum);
		
		int difference = value1 - value2;
		
		System.out.println("difference: " + difference);
		
		int product = value1*value2;
		
		System.out.println("product: " + product);
		
		double average = ((double)sum/2);
		
		System.out.println("average: " + average);
		
		int distance = Math.abs(difference);
		
		System.out.println("distance: " + distance);
		
		int max = Math.max(value1, value2);
		
		System.out.println("maximum: " + max);
		
		int min = Math.min(value1, value2);
		
		System.out.println("minimum: " + min);
		
		
		
		
		

	}

}
