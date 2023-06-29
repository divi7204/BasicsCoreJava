package fundamentals;
import java.util.Scanner;
public class PowerCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=sc.nextInt();
		System.out.println("Enter the power");
		int pow=sc.nextInt();
		//using inbuilt method
		int ans=(int)Math.pow(base, pow);
		System.out.println("The answer using inbuilt function "+ans);
		int res=1;
		for(int i=1;i<=pow;i++) {
			res*=base;
		}
		System.out.println("The answer is "+res);
	}

}
