package fundamentals;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			int digit= num%10;
			rev=rev*10+digit;
			num/=10;
		}
		System.out.println("The reverse of number is "+rev);
	}

}
