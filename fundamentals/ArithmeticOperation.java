package fundamentals;
import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=0;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition "+(a+b));
		System.out.println("Subtraction "+(a-b));
		System.out.println("Product "+(a*b));
		if(b!=0) {
			System.out.println("Quotient "+(a/b));
		}
		else {
			System.out.println("error while dividing");
		}
		
	}

}
