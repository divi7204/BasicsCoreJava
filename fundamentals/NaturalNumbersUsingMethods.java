package fundamentals;

public class NaturalNumbersUsingMethods {
	public int sumOfNaturalNumber() {
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		NaturalNumbersUsingMethods n= new NaturalNumbersUsingMethods();
		int sum=n.sumOfNaturalNumber();
		System.out.println("The sum is "+sum);
	}

}
