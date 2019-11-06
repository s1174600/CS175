package ch6;

import java.util.Scanner;

public class E53 {

public static void main(String[] args) {
 
  Scanner in = new Scanner(System.in);
  
  System.out.println("Please put in a number");
 int number;
 number = in.nextInt();
 
  if(number <10) {
   System.out.println("1 digit");
  } 
  else if(number <100) {
   System.out.println("2 digits");
  } 
  else if(number <1000) {
   System.out.println("3 digits");
  } 
  else if(number <10000) {
   System.out.println("4 digits");
  } 
  else if(number <100000) {
   System.out.println("5 digits");
  } 
  else if(number <1000000) {
   System.out.println("6 digits");
  } 
  else if(number <10000000) {
   System.out.println("7 digits");
  } 
  else if(number <100000000) {
   System.out.println("8 digit");
  } 
  else if(number <1000000000) {
   System.out.println("9 digit");
  } 
  else if(number >1000000000) {
   System.out.println("Over 9 digits");
  }

 
}

}
