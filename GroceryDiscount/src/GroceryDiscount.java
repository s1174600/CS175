import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Please enter the cost of your groceries or '0' to quit: ");
        double groceries = input.nextDouble();
        {
        input.close();

        double couponPrice = 0;
        if (groceries >= 10 && groceries <= 60) {
            couponPrice = groceries * 0.08;
        }
        else if (groceries >= 61 && groceries <= 150) {
            couponPrice = groceries * 0.1;
        }
        else if (groceries >= 151 && groceries <= 210) {
            couponPrice = groceries * 0.12;
        }
        else if (groceries >= 211) {
            couponPrice = groceries * 0.14;
        }

        if (couponPrice > 0) {
            System.out.printf("You win a coupon with price of: $%.2f", couponPrice);
        }
        else {
            System.out.printf("You don't win a coupon!");
        }
    }
	}
		

	}


