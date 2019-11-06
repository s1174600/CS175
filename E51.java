package ch4;

import java.util.Scanner;

public class E51 {

public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 
 System.out.println("Insert an integer value... ");
 
 int x = in.nextInt();
 
 String NegzeroPos = "";
 
 if(x<0)
  NegzeroPos = "negative number";
 else if(x==0)
  NegzeroPos = "zero";
 else
  NegzeroPos = "positive number";
 
 System.out.println(x + " is a " + NegzeroPos);
 
 in.close();
 
 
 

}//main

}//class
