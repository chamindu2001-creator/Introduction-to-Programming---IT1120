import java.util.Scanner;
	public class lab7q1a{
		public static void main (String[] args){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter marks of the first subject: ");
			int sub1 = input.nextInt();
			
			System.out.println("Enter marks of the second subject: ");
			int sub2 = input.nextInt();
			
			System.out.println("Enter marks of the third subject: ");
			int sub3 = input.nextInt();
			
			System.out.println("Enter marks of the fourth subject: ");
			int sub4 = input.nextInt();
			
			double avg = (sub1 + sub2 + sub3 + sub4)/4.0;
			System.out.println("Average is: " + avg);

			
			if(100>= avg && avg>=75){
				System.out.println("Overall Grade is: Distinction pass");
			}
			
			else if(74>= avg && avg >=50){
				System.out.println("Overall Grade is: Credit pass");
			}
			
			else if(49>= avg && avg>=0){
				System.out.println("Overall Grade is: Fail");
			}
			
			else{
				System.out.println("Invalid mark entered");
			}
			
		}
	}
