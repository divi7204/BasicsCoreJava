package fundamentals;
import java.util.Scanner;
public class FibonocciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int first=0,next=1;
		System.out.println("Enter count of fibonacci series to be calculated");
		int n=sc.nextInt();
		System.out.print("0"+" "+"1"+" ");
		for(int i=2;i<n;i++) {
			int sum=first+next;
			System.out.print(sum+" ");
			first=next;
			next=sum;
		}
	}

}
