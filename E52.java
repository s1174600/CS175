package ch4;

import java.util.Scanner;

public class E52 {

public static void main(String[] args) {
 
 Scanner in = new Scanner(System.in);
 
 
 double number;
 System.out.println("Please enter a number: ");
 number = in.nextDouble();
 
 if(number >= 1) {
  System.out.println("positive");
 }
 else if (number <= -1) {
  System.out.println("negative");
 }
 else if (number == 0){
 System.out.println("zero");
 
 }
 
 if(Math.abs(number) < 1) {
  System.out.println("small");
 }
 else if(Math.abs(number) > 1000000) {
  System.out.println("large");
 }
 
 

}

}
