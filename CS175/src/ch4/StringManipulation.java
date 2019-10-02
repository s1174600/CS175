package ch4;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Write your name:");
		String name = in.next();
		
		
		System.out.println("The name is " + name);
		
		char c1 = name.charAt(0);
		
		System.out.println("Initial character: " + c1);
		
		int l = name.length();
		char c2 = name.charAt(l-1);
		
		System.out.println("Final character: " + c2);
		
		
	}

}
