import java.util.Scanner;
public class lab6q3{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int t=0;
		int s=0;
		int c=0;
		double d;
		double r;
		System.out.println("Enter positive integers (terminate input with -99):");
		System.out.print("Enter a number :");
		int i=sc.nextInt();
		while (i != -99){
			if (i>0){
				s=0;
				s=i*i;
				t=t+s;
				c++;
				System.out.print("Enter a number :");
				i=sc.nextInt();
			}
			else{
				System.out.println("Invalid input Please eter a positive integer or -99 to terminate ");
				System.out.print("Enter a number :");
				i=sc.nextInt();
			}
		}
		d=t/c;
		r=Math.sqrt(d);
		System.out.print("The Root Mean Square (RMS) is :"+r);
	}
}