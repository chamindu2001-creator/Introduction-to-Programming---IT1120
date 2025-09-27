BEGIN
    // Declare variables
    SET num1 AS number
    SET num2 AS number
    SET sum AS number
    SET average AS number

    // Input two numbers
    PRINT "Enter first number: "
    READ num1
    PRINT "Enter second number: "
    READ num2

    // Calculate sum and average
    SET sum = num1 + num2
    SET average = sum / 2

    // Output results
    PRINT "Sum is: ", sum
    PRINT "Average is: ", average

END

//java program

import java.util.Scanner;

public class lab2q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, sum, average;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        sum = num1 + num2;
        average = sum / 2;

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
        scanner.close();
    }
}