package fundamentals;
import java.util.Scanner;
public class SwitchConditions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number between 1 to 4");
		int num=sc.nextInt();
		switch(num) {
		case 1: System.out.println("You entered 1");
		break;
		case 2: System.out.println("You entered 2");
		break;
		case 3: System.out.println("You entered 3");
		break;
		case 4:System.out.println("You entered 4");
		break;
		default:System.out.println("Read the message properly");
		break;
		}

	}

}
