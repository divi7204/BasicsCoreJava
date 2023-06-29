package fundamentals;
import java.util.Scanner;
public class Amicables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find Amicable or not");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int sum=0,sum1=0;
		int ma=Math.max(num, num1);
		for(int i=1;i<=ma;i++) {
			if(num%i==0) {
				sum+=i;
			}
			if(num1%i==0) {
				sum1+=i;
			}
			
		}
		int div=sum/num;
		int div1=sum1/num1;
		if(div==div1) {
			System.out.println("Amicable");
		}
		else {
			System.out.println("Not Amicable");
		}
		
	}

}
