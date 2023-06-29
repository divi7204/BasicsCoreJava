package fundamentals;
import java.util.Scanner;
public class FactorsOf10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it is factor or not");
		int num=sc.nextInt();
		if(10%num!=0) {
			System.out.println("It is not the factor of ten");
		}
		else {
			System.out.println("It is the factor of ten");
		}
	}

}
