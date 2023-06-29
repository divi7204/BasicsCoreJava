package fundamentals;
import java.util.Scanner;
public class AutoMorphicNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check whether it is AutoMorphic or not");
		int num=sc.nextInt();
		int sq=num*num;
		int ans=0;
		while(num!=0) {
			if(num%10!=sq%10) {
				System.out.println("Not AutoMorphic");
				ans=1;
			}
				num=num/10;
				sq=sq/10;
		}
		if(ans==0) {
			System.out.println("AutoMorphic");
		}
		
	}

}
