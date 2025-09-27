import java.util.Scanner;
public class lab8q1a {
	public static void main(String[] args) {

		int myArray[] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers :");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print("Enter Number " + (i+1) + ": ");
			myArray[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Array in Reverse Order :");
		for (int i = 4; i >= 0; i--) {
			System.out.print(myArray[i] + " ");
		}
	}
}