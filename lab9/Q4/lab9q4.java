import java.util.Scanner;

public class lab9q4 {
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return 0.3 * assignmentMark + 0.7 * examMark;
    }

    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.println(name + "\t" + finalMark + "\t" + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name\tFinal Mark\tGrade");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();

            scanner.nextLine(); // Consume newline

            double finalMark = calcFinalMark(assignmentMark, examMark);
            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        scanner.close();
    }
}