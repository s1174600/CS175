package CarCostv2;

import java.util.Scanner;
public class CarCostCalculationversion2 {

public static void main(String[] args) {
 // TODO Auto-generated method stub
 
 double costofregularcar;
 double mpgregular;
 double costofhybridcar;
 double mpghybrid;
 double milestravelled;
 double costgas;
 double regularcar1;
 double hybridcar1;
 double regularcar2;
 double hybridcar2;
 double regularcar3;
 double hybridcar3;
 double regularcar4;
 double hybridcar4;
 double regularcar5;
 double hybridcar5;
 String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
 String stickerRegular= "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
 String [] stuffH = stickerHybrid.split(",");
 String [] stuffR = stickerRegular.split(",");
 Scanner L=new Scanner(System.in);
 String [] costR = stuffR[2].split(":");
 System.out.println("Cost of a regular car: " +costR[1]);
 costofregularcar=Integer.parseInt(costR[1]);
 String[]mpgR= stuffR[3].split(":");
 System.out.println("State the miles per gallon of the regular car: "+mpgR[1]);
 mpgregular=Integer.parseInt(mpgR[1]);
 
 String[]costH= stuffH[2].split(":");
 System.out.println("Cost of a hybrid car: "+costH[1]);
 costofhybridcar=Integer.parseInt(costH[1]);
 String[]mpgH= stuffH[3].split(":");
 System.out.println("State the miles per gallon of a hybrid car: "+mpgH[1]);
 mpghybrid=Integer.parseInt(mpgH[1]);
 System.out.println("State miles travelled");
 milestravelled=L.nextInt();
 System.out.println("What is the cost of gas: ");
 costgas=L.nextDouble();
 
 regularcar1= (((milestravelled/mpgregular)*costgas)+costofregularcar);
 hybridcar1= (((milestravelled/mpghybrid)*costgas)+costofhybridcar);
 String[]makeR= stuffR[0].split(":");
 String[]modelR= stuffR[1].split(":");
 String[]makeH= stuffH[0].split(":");
 String[]modelH= stuffH[1].split(":");
 System.out.println("Cost to own after year 1 for "+makeR[1]+" "+modelR[1]+":"+regularcar1+" for "+makeH[1]+" "+modelH[1]+":"+ hybridcar1);
 regularcar2= (((milestravelled/mpgregular)*costgas)+regularcar1);
 hybridcar2= (((milestravelled/mpghybrid)*costgas)+hybridcar1);
 System.out.println("Cost to own after year 2 for "+makeR[1]+" "+modelR[1]+":"+regularcar2+" for "+makeH[1]+" "+modelH[1]+":"+ hybridcar2);
 regularcar3= (((milestravelled/mpgregular)*costgas)+regularcar2);
 hybridcar3= (((milestravelled/mpghybrid)*costgas)+hybridcar2);
 System.out.println("Cost to own after year 3 for "+makeR[1]+" "+modelR[1]+":"+regularcar3+" for "+makeH[1]+" "+modelH[1]+":"+ hybridcar3);
 regularcar4= (((milestravelled/mpgregular)*costgas)+regularcar3);
 hybridcar4= (((milestravelled/mpghybrid)*costgas)+hybridcar3);
 System.out.println("Cost to own after year 4 for "+makeR[1]+" "+modelR[1]+":"+regularcar4+" for "+makeH[1]+" "+modelH[1]+":"+ hybridcar4);
 regularcar5= (((milestravelled/mpgregular)*costgas)+regularcar4);
 hybridcar5= (((milestravelled/mpghybrid)*costgas)+hybridcar4);
 System.out.println("Cost to own after year 5 for "+makeR[1]+" "+modelR[1]+":"+regularcar5+" for "+makeH[1]+" "+modelH[1]+":"+ hybridcar5);
 
 System.out.println("The Toyota Prius pays back after 5 years");
 
 
}

}
