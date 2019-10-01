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
		
		System.out.println("value1 + value2: " + sum);

	}

}
