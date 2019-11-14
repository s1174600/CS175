import java.util.Scanner;

public class GPAversion1 {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double Grade = 0;

System.out.println("Enter a letter grade (followed by + or - if applicable) or enter Q to quit: ");

while (in.hasNext()) {
 String grade = in.next();
if (grade.equals("Q")) {
 break;
}
if (grade.equals("A") || grade.equals("A+")) {
 Grade = 4.0;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("A-")) {
 Grade = 3.7;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("B+")) {
 Grade = 3.3;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("B")) {
 Grade = 3.0;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("B-")) {
 Grade = 2.7;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("C+")) {
 Grade = 2.3;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("C")) {
 Grade = 2.0;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("C-")) {
 Grade = 1.7;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("D+")) {
 Grade = 1.3;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("D")) {
 Grade = 1.0;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("D-")) {
 Grade = 0.7;
 System.out.println("Numeric value: " + Grade);
}
else if (grade.equals("F")) {
 Grade = 0;
 System.out.println("Numeric value: " + Grade);
}
else {
 System.out.println("Invaild Letter");
}



}


}



}
