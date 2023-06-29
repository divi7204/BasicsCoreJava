package fundamentals;
import java.util.Scanner;
public class Range {
	public int findSum(int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers which are in range sum has to be found");
		int start=sc.nextInt();
		int end=sc.nextInt();
		Range r= new Range();
		System.out.println("The sum of range is "+r.findSum(start, end));
	}

}
