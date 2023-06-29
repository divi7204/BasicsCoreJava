package fundamentals;
import java.util.Scanner;
public class StrongNumber {
	static int findStrong(int num) {
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			int fact=factorial(digit);
			sum+=fact;
			num/=10;
		}
		return sum;
	}
	static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find whether it is strong or not ");
		int num=sc.nextInt();
		int ans=findStrong(num);
		if(num!=ans) {
			System.out.println("The number is not strong");
		}
		else {
			System.out.println("The number is strong");
		}
		
	}

}
