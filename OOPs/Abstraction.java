package OOPs;

public abstract class Abstraction {
	//Non abstract method
	int sum(int a, int b) {
		return a+b;
	}
	abstract int sub(); //Abstract method

	public static void main(String[] args) {
		//An abstract class can have abstract variable and function. Non abstract functions were can be created.
		int a=12; //non abstract variable
		System.out.println(a);
		
	}

}
