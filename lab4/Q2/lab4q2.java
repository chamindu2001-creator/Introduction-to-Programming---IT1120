import java.util.Scanner;

public class lab4q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double examMarks, labMarks, examPercentage, labPercentage, finalMark;

        // Input and validate exam marks
        System.out.print("Please enter exam marks: ");
        examMarks = scanner.nextDouble();
        while (examMarks < 0 || examMarks > 100) {
            System.out.print("Invalid exam marks. Please enter marks between 0 and 100: ");
            examMarks = scanner.nextDouble();
        }

        // Input and validate lab submission marks
        System.out.print("Please enter lab submission marks: ");
        labMarks = scanner.nextDouble();
        while (labMarks < 0 || labMarks > 100) {
            System.out.print("Invalid lab marks. Please enter marks between 0 and 100: ");
            labMarks = scanner.nextDouble();
        }

        // Input and validate exam percentage
        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = scanner.nextDouble();
        while (examPercentage < 0 || examPercentage > 100) {
            System.out.print("Invalid percentage. Please enter a percentage between 0 and 100: ");
            examPercentage = scanner.nextDouble();
        }

        // Input and validate lab percentage
        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = scanner.nextDouble();
        while (labPercentage < 0 || labPercentage > 100) {
            System.out.print("Invalid percentage. Please enter a percentage between 0 and 100: ");
            labPercentage = scanner.nextDouble();
        }

        // Validate that percentages add up to 100
        while (examPercentage + labPercentage != 100) {
            System.out.println("Percentages do not add to 100. Please re-enter percentages.");
            System.out.print("Please enter the percentage given for the exam: ");
            examPercentage = scanner.nextDouble();
            while (examPercentage < 0 || examPercentage > 100) {
                System.out.print("Invalid percentage. Please enter a percentage between 0 and 100: ");
                examPercentage = scanner.nextDouble();
            }
            System.out.print("Please enter the percentage given for the lab submission: ");
            labPercentage = scanner.nextDouble();
            while (labPercentage < 0 || labPercentage > 100) {
                System.out.print("Invalid percentage. Please enter a percentage between 0 and 100: ");
                labPercentage = scanner.nextDouble();
            }
        }

        // Calculate final mark
        finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Output the result
        System.out.println("Final exam mark: " + finalMark);

        scanner.close();
    }
}