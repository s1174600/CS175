
public class PaintCost {

	public static void main(String[] args) {
		/*
		 * This program will calculate the cost to paint a house
		 */
        System.out.println("The cost of painting per square foot= $2.00");
		int houseLengthFeet=20;
        double inches = 6;
        System.out.println("houseLengthFeet= " + (houseLengthFeet + inches/12));
        
        int houseWidthFeet=10;
        double inches1 = 6;
        System.out.println("houseWidthFeet= " + (houseWidthFeet + inches1/12));
        
        int houseHeightFeet=15;
        double inches2 = 6;
        System.out.println("houseHeightFeet= " + (houseHeightFeet + inches2/12));
        
        int windowLengthFeet=4;
        double inches3 = 6;
        System.out.println("windowLengthFeet= " + (windowLengthFeet + inches3/12));
        
        int windowWidthFeet=2;
        double inches4 = 6;
        System.out.println("windowWidthFeet= " + (windowWidthFeet + inches4/12));
        
        int doorLengthFeet=8;
        double inches5 = 6;
        System.out.println("doorLengthFeet= " + (doorLengthFeet + inches5/12));
        
        int doorWidthFeet=4;
        double inches6 = 6;
        System.out.println("doorWidthFeet= " + (doorWidthFeet + inches6/12));
        
        
        
        double x = 2*((houseLengthFeet + inches/12)*(houseWidthFeet + inches1/12));
        double a = 2*((x) + .5*((houseLengthFeet + inches/12)*((houseHeightFeet + inches2/12) - (houseWidthFeet + inches1/12))));
        double x1 = 4*((windowLengthFeet + inches3/12)*(windowWidthFeet + inches4/12));
        double a1 = 2*((doorLengthFeet + inches5/12)*(doorWidthFeet + inches6/12));
        double c = ((x+a)-(x1+a1));
        double c1 = (c*2);
       
        System.out.println("Area of Normal Sides= " + (x));
        System.out.println("Area of Peak Sides= " + (a)); 
        System.out.println("Area of Windows= " + (x1));
        System.out.println("Area of Doors= " + (a1));
        System.out.println("Area of House, not including WIndows and Doors= " + c);
        System.out.println("The cost to paint this house is $" + c1 + "0");
        
        
        
        
        
        
        
        
        		
        		
        
        
        
        
		
		
        
        
        
        
      
        
        
        
        
        
        
        
        
	}

}
