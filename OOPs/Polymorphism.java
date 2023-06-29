package OOPs;
import java.util.Scanner;
public class Polymorphism {
	int sum(int a, int b) {
		return a+b;
	}
	int sum(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Polymorphism p= new Polymorphism();
	System.out.println("Enter the two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	//calling function having only 2 parameters
	System.out.println("The sum is "+p.sum(a,b));
	
	//calling function having 3 parameters
	System.out.println("The sum is "+p.sum(a,b,15));
	
	//same function with different parameter calls different number.
	}

}
