package fundamentals;
import java.util.Scanner;
public class NaturalNumbersFromUser {
	public int sum(int n) {
		int ans=0;
		for(int i=1;i<=n;i++) {
			ans+=i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sum of natural number to be calculated");
		int n=sc.nextInt();
		NaturalNumbersFromUser obj= new NaturalNumbersFromUser();
		System.out.println("The sum of natural number is "+obj.sum(n));
	}

}
