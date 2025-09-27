import java.util.Scanner;
public class lab6q2b{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] number=new int[10];
		System.out.println("Please enter 10 number :");
		
		for (int i=0; i<10; i++){
			System.out.print("Enter number" + (i+1)+ ": ");
			number[i]=sc.nextInt();
		}
		System.out.println("The numbers your entered are: ");
		for (int i=0; i<10; i++){
			System.out.print(number[i]+" ");
			
		}
	}
}