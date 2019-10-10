package ch4;

import java.util.Scanner;

public class a43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner keyIn = new Scanner(System.in);
		
		System.out.println("Please enter a number now: ");
		
		int number = keyIn.nextInt();
		
		System.out.println("number^2: " + Math.pow(number, 2));
		
		System.out.println("number^2: " + number * number);
		
		System.out.println("number^4: " + Math.pow(number, 4));
	}

}
