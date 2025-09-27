import java.util.Scanner;
public class lab8q1b {
	public static void main(String[] args) {

		// create arrays
		int myArray[] = new int [5];
		int evenArray[] = new int[myArray.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers :");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print("Enter Number " + (i+1) + ": ");
			myArray[i] = sc.nextInt(); // inputs to array
		}
		// print user inputs
		System.out.println();
		System.out.println("myArray Contents :");
		for (int i = 0; i < 5; i++) {
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		// get even numbers to evenArray from myArray
		int evenNumbers = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 == 0) {
		evenArray[evenNumbers] = myArray[i];
		evenNumbers++;
			}
		}
		// print even numbers
		System.out.println("evenArray Contents :");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(evenArray[i] + " ");
		}
	}
}