package fundamentals;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check palindrome");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(temp!=rev) {
			System.out.println("The num is not palindrome");
			
		}
		else {
			System.out.println("The num is palindrome");
		}
	}

}
