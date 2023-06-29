package fundamentals;
import java.util.Scanner;
public class ArmStrongNumber {
	public int countNumber(int num) {
		int count=0;
		while(num!=0) {
			int digit=num%10;
			count++;
			num/=10;
		}
		return count;
	}
	public int power(int num, int count) {
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			int ans=(int)Math.pow(digit, count);
			sum+=ans;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find armstrong or not");
		int num=sc.nextInt();
		int temp=num;
		ArmStrongNumber n= new ArmStrongNumber();
		int count=n.countNumber(num);
		int sum= n.power(num, count);
		if(temp!=sum) {
			System.out.println("Entered number is not Armstrong number");
		}
		else {
			System.out.println("Entered number is Armstrong number");
		}
	}

}
