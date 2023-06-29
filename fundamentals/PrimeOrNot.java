package fundamentals;
import java.util.Scanner;
public class PrimeOrNot {
	public int findPrime(int num) {
		int flag=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
				return flag;
			}
		}
		return flag;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		PrimeOrNot f=new PrimeOrNot();
		int ans=f.findPrime(num);
		if(ans==1) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
		}
		
	}

}
