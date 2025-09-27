import java.util.Scanner;
public class lab8q3 {
	public static void main(String[] args) {
		
		// create an array
		int array[] = new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.print("Enter a Positive Number " + "(" + (i+1) + "/6): ");
			array[i] = sc.nextInt();
			
			// check condition
			if (array[i] <= 0) {
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				i--;
			}
		}
		System.out.println();
		
		// find the max
		int max = array[0];
		System.out.println("Array Contents:");
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("The Maximum Number Entered: " + max);
	}
}