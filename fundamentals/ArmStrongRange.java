package fundamentals;
import java.util.Scanner;
public class ArmStrongRange {
	public int counting(int num) {
		int count=0;
		while(num!=0) {
			int digit=num%10;
			count++;
			num/=10;
		}
		return count;
	}
	public int power(int num,int count) {
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum+=(int)Math.pow(digit, count);
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int countofarm=0;
		ArmStrongRange r= new ArmStrongRange();
		for(int i=start;i<=end;i++) {
			int count=r.counting(i);
			int sum=r.power(i, count);
			if(i!=sum) {}
			else {
				System.out.println(i);
				countofarm++;
			}
		}
		System.out.println("The count of armstrong number is "+countofarm);
		
	}

}
