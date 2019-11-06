package ch6;

import java.util.Scanner;

public class E58 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter integer a: ");
		int a = in.nextInt();
		System.out.println("Please enter integer b: ");
		int b = in.nextInt();
		System.out.println("Please enter integer c: ");
		int c = in.nextInt();
		System.out.println("Please enter integer d: ");
		int d = in.nextInt();
		
		if((((a == b) & c == d) | ((a == d) & (b == c)))) {
		System.out.println("two pairs");
		}
		else 
			System.out.println("not two pairs");
		
		
		

	}

}
