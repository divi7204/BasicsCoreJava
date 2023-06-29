package StringsBasics;
import java.util.Scanner;
public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		char c[]= str.toCharArray();
		int k=c.length;
		char rev[]= new char[k];
		for(int i=0;i<c.length;i++) {
			k--;
			rev[k]=c[i];
			
		}
		String s = new String(rev);
		System.out.println("Reversed string is "+ s);
		
	}

}
