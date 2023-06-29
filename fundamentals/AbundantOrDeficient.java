package fundamentals;
import java.util.Scanner;
public class AbundantOrDeficient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find Abundant or Deficient");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num>sum) {
			System.out.println("Deficient Number");
		}
		else {
			System.out.println("Abundant Number");
		}
	}

}
