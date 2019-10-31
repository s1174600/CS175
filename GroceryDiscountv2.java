import java.util.Scanner;

public class GroceryDiscountv2 {

public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 double total = 0;
 int count = 0;
 System.out.println("Enter grocery amount, any other response to end: ");
 
 
 while(input.hasNextDouble())
 {
  double groceries1 = input.nextDouble();
 if(groceries1 >= 10 && groceries1 <= 1000){
   
   
   
   

   {
   
    System.out.println(" Please enter the cost of your groceries or '0' to quit: ");
    double groceries = input.nextDouble();
     {
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
            System.out.printf("You win a discount coupon of $ " + couponPrice + " " + percentage);
        }
        else {
            System.out.printf("You are not eligible for a coupon this time.");
         
         
   }
 }
   
}
   
   }
 else {
    System.out.println("You are not eligible for a coupon this time");

}
}
}
}
