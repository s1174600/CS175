package ch6;

import java.util.Scanner;

public class E59 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the compass degrees: ");
		double x = in.nextDouble();
		if(x == 360 || ((x <= 45) & (x >= 0))) {
			System.out.println("N");
		}
		else if((x >= 46) & (x <= 89)) {
			System.out.println("NE");
		}
		else if((x >= 90) & (x <= 135)) {
			System.out.println("E");
		}
		else if((x >= 136) & (x <= 179)) {
			System.out.println("SE");
		}
		else if((x >= 180) & (x <= 225)) {
			System.out.println("S");
		}
		else if((x >= 226) & (x <= 269)) {
			System.out.println("SW");
		}
		else if((x >= 270) & (x <= 315)) {
			System.out.println("W");
		}
		else if((x >=316) & (x <= 359)) {
			System.out.println("NW");
		}
		

	}

}
