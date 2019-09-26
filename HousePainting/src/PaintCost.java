
public class PaintCost {

	public static void main(String[] args) {
		/*
		 * This program will calculate the cost to paint a house
		 */
        System.out.println("The cost of painting per square foot is $5.00");
        System.out.println("There are 2 normal sides and 2 peaked sides of the house, as well as 10 windows and 2 doors");
		int houseLengthFeet=40;
        System.out.println("houseLengthFeet= " + (houseLengthFeet));
        
        int houseWidthFeet=15;
        System.out.println("houseWidthFeet= " + (houseWidthFeet));
        
        int houseHeightFeet=25;
        System.out.println("houseHeightFeet= " + (houseHeightFeet));
        
        int windowLengthFeet=4;
        System.out.println("windowLengthFeet= " + (windowLengthFeet));
        
        int windowWidthFeet=2;
        System.out.println("windowWidthFeet= " + (windowWidthFeet));
        
        int doorLengthFeet=6;
        System.out.println("doorLengthFeet= " + (doorLengthFeet));
        
        int doorWidthFeet=3;
        System.out.println("doorWidthFeet= " + (doorWidthFeet));
        
        
        
        double x = 2*((houseLengthFeet)*(houseWidthFeet));
        double a = 2*((x/2) + .5*(houseLengthFeet*(houseHeightFeet - houseWidthFeet)));
        double x1 = 10*((windowLengthFeet)*(windowWidthFeet));
        double a1 = 2*((doorLengthFeet)*(doorWidthFeet));
        double c = ((x+a)-(x1+a1));
        double c1 = (c*5);
       
        System.out.println("Area of Normal Sides= " + (x));
        System.out.println("Area of Peak Sides= " + (a)); 
        System.out.println("Area of Windows= " + (x1));
        System.out.println("Area of Doors= " + (a1));
        System.out.println("Area of House, not including Windows and Doors(sqare feet to paint)= " + c);
        System.out.println("The cost to paint this house is $" + c1 + "0");
        
        
        
        
        
        
        
        
        		
        		
        
        
        
        
		
		
        
        
        
        
      
        
        
        
        
        
        
        
        
	}

}
