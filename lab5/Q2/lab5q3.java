import java.util.Scanner;


public class lab5q3 {
public static void main (String [] args) {
	
	//initializing
	Scanner scanner = new Scanner(System.in);
	String prize;
	
	
	//checking for valid input
	System.out.println("Please enter the number of people");
	
	int peopleCounter = scanner.nextInt();
	
	if(peopleCounter<0) {	
		
		
		}else{switch (peopleCounter) {
		
	case 0:
		prize = "gtfo off no prize";
		break;
	
	case 1:	
		prize = "Pen";
		break;
		
	case 2 :
		prize = "Umbrella";
		break;
		
	case 3 :
		prize = "Bag";
		break;
		
	case 4:
		prize = "Travelling Bag";
		break;
		
	default:	
		prize = "Headphone yayyy";
		break;
			}
		System.out.println("Your prize is"+prize);
		}
	
	}
}
