package DSA;
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		String s1=str.toUpperCase();
		String s2= str.toLowerCase();
		String s3=str.substring(1);
		int len= str.length();
		System.out.println("Upper Case "+s1);
		System.out.println("Lower Case "+s1);
		System.out.println("Substring "+s1);
		boolean s= str.contains("t");
		System.out.println(s);
		char ch[]=str.toCharArray();
		System.out.println(ch);
		str=str.concat(" language");
		System.out.println("final string "+str);
		str.split(" ");
		System.out.println(str);
		System.out.println("char at index "+str.charAt(0));
	}

}
