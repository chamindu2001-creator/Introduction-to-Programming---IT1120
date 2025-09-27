import java.util.Scanner;

public class lab10q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark;
        String grade;

        // Input mark
        System.out.print("Enter the mark (0 - 100): ");
        mark = scanner.nextDouble();

        // Assertion to check if mark is within valid range
        assert mark >= 0 && mark <= 100 : "Invalid Mark!";
        System.out.println("Mark is Validated");

        // Determine grade
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Assertion to verify grade assignment
        assert (mark >= 75 && grade.equals("A")) || 
               (mark >= 60 && mark < 75 && grade.equals("B")) || 
               (mark >= 50 && mark < 60 && grade.equals("C")) || 
               (mark >= 40 && mark < 50 && grade.equals("D")) || 
               (mark < 40 && grade.equals("F")) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        scanner.close();
    }
}