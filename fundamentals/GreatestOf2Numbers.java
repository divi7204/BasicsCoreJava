package fundamentals;
import java.util.Scanner;
public class GreatestOf2Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
	}

}
