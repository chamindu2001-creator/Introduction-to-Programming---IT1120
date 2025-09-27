import java.util.Scanner;
import java.util.ArrayList;

public class lab5q1 {
public static void main (String [] args) {
	
	//initializing 
	
	int counter = 1;
	int secondCounter = 0;
	Scanner scanner = new Scanner(System.in);
	ArrayList <Integer> IntegerList = new ArrayList<Integer>(); 
	
	
		while(counter<=4) {
			System.out.print("Enter the "+counter+" integer");
			int UserInput = scanner.nextInt();
			
			
			System.out.println("User Input: "+UserInput);
			
			//incrementing 
			counter++;
			
			IntegerList.add(UserInput);
		
		}
		
			int smallestNumber= IntegerList.get(0);
			int largestNumber = IntegerList.get(0);
			
			while(secondCounter < IntegerList.size()) {
				
				int currentNumber = IntegerList.get(secondCounter);
				
				if (currentNumber<smallestNumber) {
					
					smallestNumber = currentNumber;
					
				}
				
				if (currentNumber>largestNumber) {
					
					largestNumber = currentNumber;
				}
				
				System.out.print(IntegerList.get(secondCounter)+" ");
				
				//increment
				secondCounter++;
			}
			System.out.println("The smallest Number is: "+smallestNumber+ " and the largest number is: "+largestNumber);
	}
}
