package fundamentals;
import java.util.Scanner;
public class FactorOfAGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find factors of it");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i!=0) {
				
			}
			else {
				System.out.print(i+" ");
			}
		}
	}

}