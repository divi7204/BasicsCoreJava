package fundamentals;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find sum of its digits");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum+=digit;
			num=num/10;
		}
		System.out.println("The sum of digits is "+sum);
	}

}
