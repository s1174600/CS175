package ch4;

import java.util.Scanner;

public class InputOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//read from input
		Scanner in = new Scanner(System.in);
		
		System.out.println("Write an integer number y and I will return y^2: ");
		
		int y = in.nextInt();
		
		System.out.println("y^2: " + Math.pow(y, 2));
		
		
		
		
		

	}//main

}//class
