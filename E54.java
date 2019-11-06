package ch4;

import java.util.Scanner;

public class E54 {

public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 
 System.out.println("Enter first number: ");
 int a = in.nextInt();
 
 System.out.println("Enter second number: ");
 int b = in.nextInt();
 
 System.out.println("enter third number: ");
 int c = in.nextInt();
 
 if(a == b && a == c ) {
  System.out.println("All the same");}
 else if (a!=b && b!=c && c!=a)
  System.out.println("All different");
 else
  System.out.println("neither");
 
 
 
 
 

}//Main

}//Class
