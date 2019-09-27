import java.util.Scanner;
public class PaintCost {

	
	public static void main(String[] args) {
		/*
		 * This program will calculate the cost to paint a house
		 */
		
		System.out.println("Enter the number of normal sides of the house: ");
		@SuppressWarnings("resource")
		Scanner norm = new Scanner(System.in);
		System.out.println("The number of normal sides is " + norm.nextLine());
		
		System.out.println("Enter the number of peaked sides: ");
		@SuppressWarnings("resource")
		Scanner peak = new Scanner(System.in);
		System.out.println("The number of peaked sides is " + peak.nextLine());
		
		System.out.println("Enter the number of windows in the house: ");
		@SuppressWarnings("resource")
		Scanner window = new Scanner(System.in);
		System.out.println("The number of windows is " + window.nextLine());
		
		System.out.println("Enter the number of doors: ");
		@SuppressWarnings("resource")
		Scanner door = new Scanner(System.in);
		System.out.println("The number of doors is " + door.nextLine());
		
		System.out.println("Enter the Length of the house: ");
		@SuppressWarnings("resource")
		Scanner L = new Scanner(System.in);
		System.out.println("The length of the house is " + L.nextLine());
		
		System.out.println("Enter the width of the house: ");
		@SuppressWarnings("resource")
		Scanner W = new Scanner(System.in);
		System.out.println("The width of the house is " + W.nextLine());
		
		System.out.println("Enter the height of the house: ");
		@SuppressWarnings("resource")
		Scanner H = new Scanner(System.in);
		System.out.println("The height of the house is " + H.nextLine());
		
		System.out.println("Enter the length of the windows: ");
		@SuppressWarnings("resource")
		Scanner WL = new Scanner(System.in);
		System.out.println("The length of the windows is " + WL.nextLine());
		
		System.out.println("Enter the width of the windows: ");
		@SuppressWarnings("resource")
		Scanner WW = new Scanner(System.in);
		System.out.println("The width of the windows is " + WW.nextLine());
		
		System.out.println("Enter the length of the doors: ");
		@SuppressWarnings("resource")
		Scanner DL = new Scanner(System.in);
		System.out.println("The length of the doors is " + DL.nextLine());
		
		System.out.println("Enter the width of the doors: ");
		@SuppressWarnings("resource")
		Scanner DW = new Scanner(System.in);
		System.out.println("The width of the doors is " + DW.nextLine());
		
		
        int houseLengthFeet=40;
        
        int houseWidthFeet=15;
        
        int houseHeightFeet=25;
        
        int windowLengthFeet=4;
        
        int windowWidthFeet=2;
        
        int doorLengthFeet=6;
       
        int doorWidthFeet=3;
		
		
        double x = 2*((houseLengthFeet)*(houseWidthFeet));
        
        double a = 2*((x/2) + .5*(houseLengthFeet*(houseHeightFeet - houseWidthFeet)));
        
        double x1 = 10*((windowLengthFeet)*(windowWidthFeet));
        
        double a1 = 2*((doorLengthFeet)*(doorWidthFeet));
        
        double area = ((x+a)-(x1+a1));
        
        double cost = (area*5);
        
        
        System.out.println("Would you like to have the windows/doors painted as well?");
        @SuppressWarnings("resource")
        Scanner YorN = new Scanner(System.in);
        System.out.println(YorN.nextLine() + ", then the area of the house minus the windows/doors is " + area);
		
        System.out.println("Please enter the cost to paint per square feet: ");
        @SuppressWarnings("resource")
        Scanner price = new Scanner(System.in);
        System.out.println(price.nextLine() + "; therefore, the cost to paint this house is $" + cost + "0");
        
        
        
        
        
       
		
        
        
      
       
        
        
        
        
        
        
        
        
        
        		
        		
        
        
        
        
		
		
        
        
        
        
      
        
        
        
        
        
        
        
        
	}

}
