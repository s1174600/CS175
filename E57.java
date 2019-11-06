package ch6;

import java.util.Scanner;

public class E57 {

public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  int number;
  int number2;
  int number3;
  int choice;
  
  System.out.println("Please put in a number");
  number = in.nextInt();
  System.out.println("Please put in the second number");
  number2 = in.nextInt();
  System.out.println("Please put in the third number");
  number3 = in.nextInt();
  System.out.println("Please decide Ascending (1) or Descending (2): ");
  choice = in.nextInt();
  
  if (choice == 2) {
   if ((number < number2) && (number2 < number3) && (number < number3)) {
    System.out.println("In order");
   } 
   else if ((number > number2) && (number2 > number3) && (number > number3)) {
    System.out.println("In order");
   } 
   else {
    System.out.println("Not in order");
   }
  } 
  else if (choice == 1) {
	  
   if ((number < number2) && (number2 <= number3) && (number < number3)) {
    System.out.println("In order");
   } 
   else if ((number > number2) && (number2 >= number3) && (number > number3)) {
    System.out.println("In order");
   } 
   else if (((number == number2) && (number2 == number3) && (number == number3))) {
    System.out.println("In order");
   }
   else {
    System.out.println("Not in order");
   }
  }
 
 
 
 
}

}
