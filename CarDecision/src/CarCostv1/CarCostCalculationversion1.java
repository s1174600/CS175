package CarCostv1;

import java.util.Scanner;

public class CarCostCalculationversion1 {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.println("Enter cost of regular car: ");
double x = in.nextDouble();

System.out.println("Enter miles per gallon of regular car: ");
double y = in.nextDouble();

System.out.println("Enter cost of hybrid car: ");
double z = in.nextDouble();

System.out.println("Enter miles per gallon of hybrid car: ");
double a = in.nextDouble();

System.out.println("Enter miles traveled in a year: ");
double b = in.nextDouble();

System.out.println("Enter cost per gallon of gas: ");
double c = in.nextDouble();

double d = (((b/y)*c)+x);
double e = (((b/y)*c)+d);
double f = (((b/y)*c)+e);
double g = (((b/y)*c)+f);
double h = (((b/y)*c)+g);

double i = (((b/a)*c)+z);
double j = (((b/a)*c)+i);
double k = (((b/a)*c)+j);
double l = (((b/a)*c)+k);
double m = (((b/a)*c)+l);


System.out.println("Cost to own after year 1 for regular car: " + d + " for hybrid car: " + i);
System.out.println("Cost to own after year 2 for regular car: " + e + " for hybrid car: " + j);
System.out.println("Cost to own after year 3 for regular car: " + f + " for hybrid car: " + k);
System.out.println("Cost to own after year 4 for regular car: " + g + " for hybrid car: " + l);
System.out.println("Cost to own after year 5 for regular car: " + h + " for hybrid car: " + m);

System.out.println("The hybrid car pays back after 5 years");




}

}
