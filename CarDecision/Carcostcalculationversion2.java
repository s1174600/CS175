
import java.util.Scanner;
public class Carcostcalculationversion2 {

public static void main(String[] args) {

 
Scanner in = new Scanner(System.in);

double a; //regcost
double b; //regmpg
double c; //hycost
double d; //hympg
double e; //mitravelled
double f; //costofgas
double g; //regcar yr1
double h; //hycar yr1
double i; //regcar yr2
double j; //hycar yr2
double k; //regcar yr3
double l; //hycar yr3
double m; //regcar yr4
double n; //hycar yr4
double o; //regcar yr5
double p; //hycar yr5

String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
String stickerRegular = "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
String [] stuffH = stickerHybrid.split(",");
String [] stuffR = stickerRegular.split(",");
String [] costR = stuffR[2].split(":");

System.out.println("Cost of a regular car: $" + costR[1]);
a = Integer.parseInt(costR[1]);
String[]mpgR = stuffR[3].split(":");

System.out.println("Miles per gallon of the regular car: " + mpgR[1]);
b = Integer.parseInt(mpgR[1]);
String[]costH = stuffH[2].split(":");

System.out.println("Cost of a hybrid car: $" + costH[1]);
c = Integer.parseInt(costH[1]);
String[]mpgH = stuffH[3].split(":");

System.out.println("Miles per gallon of a hybrid car: " + mpgH[1]);
d = Integer.parseInt(mpgH[1]);

System.out.println("Enter the miles travelled: ");
e = in.nextInt();

System.out.println("Enter the cost of gas: ");
f = in.nextDouble();
g = (((e/b)*f)+a);
h = (((e/d)*f)+c);
String[]makeR = stuffR[0].split(":");
String[]modelR = stuffR[1].split(":");
String[]makeH = stuffH[0].split(":");
String[]modelH = stuffH[1].split(":");


System.out.println("Cost to own after year 1 for " + makeR[1] + " " + modelR[1] + ": " + g + " for " + makeH[1] + " " + modelH[1] + ":" + h);
i = (((e/b)*f)+g);
j = (((e/d)*f)+h);

System.out.println("Cost to own after year 2 for " + makeR[1] + " " + modelR[1] + ": " + i + " for " + makeH[1] + " " + modelH[1] + ":" + j);
k = (((e/b)*f)+i);
l = (((e/d)*f)+j);

System.out.println("Cost to own after year 3 for " + makeR[1] + " " + modelR[1] + ": " + k + " for " + makeH[1] + " " + modelH[1] + ":" + l);
m = (((e/b)*f)+k);
n = (((e/d)*f)+l);

System.out.println("Cost to own after year 4 for " + makeR[1] + " " + modelR[1] + ": " + m + " for " + makeH[1] + " " + modelH[1] + ":" + n);
o = (((e/b)*f)+m);
p = (((e/d)*f)+n);

System.out.println("Cost to own after year 5 for " + makeR[1] + " " + modelR[1] + ": " + o + " for " + makeH[1] + " " + modelH[1] + ":" + p);

System.out.println("The Toyota Prius pays back after 5 years");


}

}

