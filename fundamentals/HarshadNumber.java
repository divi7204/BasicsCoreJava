package fundamentals;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to find whether it is Harshad number or not");
		int num=sc.nextInt();
		int temp=num,sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		if(temp%sum!=0) {
			System.out.println("It is not a Harshad Number");
		}
		else {
			System.out.println("It is a Harshad Number");
		}
	}

}
