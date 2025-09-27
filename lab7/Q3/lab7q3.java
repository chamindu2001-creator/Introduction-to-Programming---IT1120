 import java.util.Scanner;

public class lab7q3 {
    public static void main(String[] args) {
        final double DISCOUNT_RATE = 0.05;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();
            input.nextLine();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            String paymentMode = input.nextLine().toUpperCase();

            if (paymentMode = "C") {
                double discount = billAmount * DISCOUNT_RATE;
                double amountToPay = billAmount - discount;
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            } else if (paymentMode = "O") {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}
 
    

