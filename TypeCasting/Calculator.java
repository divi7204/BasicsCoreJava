package TypeCasting;

public class Calculator {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int multiplication(int a,int b) {
		return a*b;
	}
	public static int division(int a,int b) {
		return a/b;
	}
	public static int add(int a,int b, int c) {
		return a+b+c;
	}
	public static int sub(int a,int b, int c) {
		return a-b-c;
	}
	public static int multiplication(int a,int b, int c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=2;
		System.out.println("Two numbers addition "+add(a,b));
		System.out.println("Two numbers subtraction "+sub(a,b));
		System.out.println("Two numbers multiplication "+multiplication(a,b));
		System.out.println("Two numbers division "+division(a,b));
		System.out.println("Three numbers addition "+add(a,b,c));
		System.out.println("Three numbers subtraction "+sub(a,b,c));
		System.out.println("Three numbers multiplication "+multiplication(a,b,c));
	}

}
