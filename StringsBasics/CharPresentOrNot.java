package StringsBasics;
import java.util.Scanner;
public class CharPresentOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String arr=sc.next();
		System.out.println("Enter char to be searched");
		String se=sc.next();
		int flag=0;
		char c=se.charAt(0);
		char c1[]=arr.toCharArray();
		for(int i=0;i<c1.length;i++) {
			if(c1[i]==c) {
				flag=1;
				System.out.println(c+" present at index "+ i);
				break;
			}
		}
		if(flag==0) {
			System.out.println(c+" not present");
		}
	}

}
