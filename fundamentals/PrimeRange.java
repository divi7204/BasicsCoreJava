package fundamentals;
import java.util.Scanner;
public class PrimeRange {
	public int findRange(int num) {
		int flag=0;
		if(num==0||num==1) {
			flag=1;
		}
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
		System.out.println("Enter the range to find the prime number list");
		int start=sc.nextInt();
		int end=sc.nextInt();
		int count=0;
		PrimeRange r=new PrimeRange();
		for(int i=start;i<=end;i++) {
			int ans=r.findRange(i);
			if(ans==1) {}
			else {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nThe number of prime number present in range are "+count);
	}

}
