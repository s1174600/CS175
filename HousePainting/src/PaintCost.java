import java.util.Scanner;
public class PaintCost {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * This program will calculate the cost to paint a house
		 */
		System.out.println("Enter the cost of paint per square foot: ");
		Scanner price = new Scanner(System.in);
		int C = price.nextInt();
		System.out.println("The cost of paint per square foot: " + C);
		System.out.println("Enter the number of normal sides of the house: ");
		Scanner norm = new Scanner(System.in);
		int numbernorm = norm.nextInt();
		System.out.println("The number of normal sides is " + numbernorm);
		
		System.out.println("Enter the number of peaked sides: ");
		Scanner peak = new Scanner(System.in);
		int numberpeak = peak.nextInt();
		System.out.println("The number of peaked sides is " + numberpeak);
		
		System.out.println("Enter the number of windows in the house: ");
		Scanner window = new Scanner(System.in);
		int numberwindow = window.nextInt();
		System.out.println("The number of windows is " + numberwindow);
		
		System.out.println("Enter the number of doors: ");
		Scanner door = new Scanner(System.in);
		int numberdoor = door.nextInt();
		System.out.println("The number of doors is " + numberdoor);
		
		System.out.println("Enter the Length of the house: ");
		Scanner houseLengthFeet = new Scanner(System.in);
		int L = houseLengthFeet.nextInt();
		System.out.println("The length of the house is " + L);
		
		System.out.println("Enter the width of the house: ");
		Scanner houseWidthFeet = new Scanner(System.in);
		int W = houseWidthFeet.nextInt();
		System.out.println("The width of the house is " + W);
		
		System.out.println("Enter the height of the house: ");
		Scanner houseHeightFeet = new Scanner(System.in);
		int H = houseHeightFeet.nextInt();
		System.out.println("The height of the house is " + H);
		
		System.out.println("Enter the length of the windows: ");
		Scanner windowLengthFeet = new Scanner(System.in);
		int WL = windowLengthFeet.nextInt();
		System.out.println("The length of the windows is " + WL);
		
		System.out.println("Enter the width of the windows: ");
		Scanner windowWidthFeet = new Scanner(System.in);
		int WW = windowWidthFeet.nextInt();
		System.out.println("The width of the windows is " + WW);
		
		System.out.println("Enter the length of the doors: ");
		Scanner doorLengthFeet = new Scanner(System.in);
		int DL = doorLengthFeet.nextInt();
		System.out.println("The length of the doors is " + DL);
		
		System.out.println("Enter the width of the doors: ");
		Scanner doorWidthFeet = new Scanner(System.in);
		int DW = doorWidthFeet.nextInt();
		System.out.println("The width of the doors is " + DW);
		
		
        
		
		
        double x = numbernorm*((L)*(W));
        
        double a = numbernorm*((x/2) + .5*(L*(H - W)));
        
        double x1 = numberwindow*((WL)*(WW));
        
        double a1 = numberdoor*((DL)*(DW));
        
        double area = ((x+a)-(x1+a1));
        
        double cost = (area*C);
        
        
        System.out.println("The area of the house minus the windows and doors is: " + area);
        
        System.out.println("The cost to paint this house is $" + cost + "0");
        
        
        
        
        
        
        
        
       
		
        
        
      
       
        
        
        
        
        
        
        
        
        
        		
        		
        
        
        
        
		
		
        
        
        
        
      
        
        
        
        
        
        
        
        
	}

}
