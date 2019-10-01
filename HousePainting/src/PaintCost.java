import java.util.Scanner;
public class PaintCost {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * This program will calculate the cost to paint a house
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the cost of paint per square foot: ");
		int C = in.nextInt();
		System.out.println("The cost of paint per square foot: " + C);
		
		System.out.println("Enter the number of normal sides of the house: ");
		int numbernorm = in.nextInt();
		System.out.println("The number of normal sides is " + numbernorm);
		
		System.out.println("Enter the number of peaked sides: ");
		int numberpeak = in.nextInt();
		System.out.println("The number of peaked sides is " + numberpeak);
		
		System.out.println("Enter the number of windows in the house: ");
		int numberwindow = in.nextInt();
		System.out.println("The number of windows is " + numberwindow);
		
		System.out.println("Enter the number of doors: ");
		int numberdoor = in.nextInt();
		System.out.println("The number of doors is " + numberdoor);
		
		System.out.println("Enter the Length of the house: ");
		int L = in.nextInt();
		System.out.println("The length of the house is " + L);
		
		System.out.println("Enter the width of the house: ");
		int W = in.nextInt();
		System.out.println("The width of the house is " + W);
		
		System.out.println("Enter the height of the house: ");
		int H = in.nextInt();
		System.out.println("The height of the house is " + H);
		
		System.out.println("Enter the length of the windows: ");
		int WL = in.nextInt();
		System.out.println("The length of the windows is " + WL);
		
		System.out.println("Enter the width of the windows: ");
		int WW = in.nextInt();
		System.out.println("The width of the windows is " + WW);
		
		System.out.println("Enter the length of the doors: ");

		int DL = in.nextInt();
		System.out.println("The length of the doors is " + DL);
		
		System.out.println("Enter the width of the doors: ");
		int DW = in.nextInt();
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
