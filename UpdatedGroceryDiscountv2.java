import java.util.Scanner;

public class UpdatedGroceryDiscountv2 {

public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 
 System.out.println("Please enter the cost of your groceries or 0 to End: ");
 
 	while(in.hasNextDouble()) {
 		double groceries = in.nextDouble();
 		 
  if(groceries >= 10 && groceries <= 1000){
	  
          double couponPrice = 0;
          String percentage = null;
        if (groceries >= 10 && groceries <= 60) {
            couponPrice = groceries * 0.08;
            percentage = "(8 percent of your purchase)";
        }
        else if (groceries >= 61 && groceries <= 150) {
            couponPrice = groceries * 0.1;
            percentage = "(10 percent of your purchase)";
        }
        else if (groceries >= 151 && groceries <= 210) {
            couponPrice = groceries * 0.12;
            percentage = "(12 percent of your purchase)";
        }
        else if (groceries >= 211) {
            couponPrice = groceries * 0.14;
            percentage = "(14 percent of your purchase)";
        }
        
  

        if (couponPrice > 0) {
            System.out.println("You win a discount coupon of $ " + couponPrice + " " + percentage);
        }
        else {
            System.out.println("You are not eligible for a coupon this time.");
        }
 	}
  else if((((groceries < 10) || (groceries > 1000)) && (groceries != 0))) {
	  System.out.println("Invalid dollar amount");
  }
  else if(groceries == 0) {
	  break;
	  
  }
  }
	  
 	}
}

   

   
   





 
 
 
   
   
   
   

  
     

