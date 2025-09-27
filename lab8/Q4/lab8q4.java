import java.util.Scanner;
public class lab8q4 {
	public static void main (String[] args) {
		
		// create an array
		int studentsArray[] = new int[8];
		Scanner sc = new Scanner(System.in);
		
		// user inputs
		for (int i = 0; i < 8; i++) {
			System.out.print("Enter Student ID for Student " + (i+1) + ": ");
			studentsArray[i] = sc.nextInt();
			
			if (studentsArray[i] <= 0) {
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				i--;
			}
		}
		System.out.println();
		
		// ID check
		System.out.print("Enter a Student ID to Search: ");
		int idSearch = sc.nextInt();
		System.out.println();
		
		// added boolean to print search output
		boolean found = false;
		for (int i = 0; i < 8; i++) {
			if (idSearch == studentsArray[i]) {
				found = true;
			}
		}
		if (found) {
			System.out.println("Student is Available");
		}
		else
			System.out.println("Student is not Available");
	}
}