package ch6;

import java.util.Scanner;
public class E55 {

public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  int number;
  int number2;
  int number3;
  
  System.out.println("Please put in a number");
  number = in.nextInt();
  System.out.println("Please put in the second number");
  number2 = in.nextInt();
  System.out.println("Please put in the third number");
  number3 = in.nextInt();
 
  if ((number < number2) && (number2 < number3) && (number < number3)) {
   System.out.println("Increasing");
  } 
  else if ((number > number2) && (number2 > number3) && (number > number3)) {
   System.out.println("Decreasing");
  } 
  else {
   System.out.println("Neither");
  }
 
 
}

}
