import java.util.Scanner;

public class labq1b {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int studentCount = 1;
		 
		 while(studentCount <= 3) {
			System.out.print("Enter marks: ");
			int mark1 = input.nextInt();	
			int mark2 = input.nextInt();
			int mark3 = input.nextInt();
			int mark4 = input.nextInt();
		
		double avg = (mark1 + mark2 + mark3 + mark4)/4.0;
		
		System.out.println("Average is : " + avg);
		 
		if (avg >= 75) {
			System.out.println("Overall Grade is : Distinction");
		}
		else if (avg >= 50) {
			System.out.println("Overall Grade is : Credit");
		}
		else {
			System.out.println("Overall Grade is : Fail");
		 }
		 System.out.println("Grade is: " + avg);
		 System.out.println();
		 studentCount++;
		}
	}
}
