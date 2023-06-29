package StringsBasics;
import java.util.Scanner;
public class ReverseEachWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		int len=str1.length;
		String ss[]=new String[len];
		int j=0;
		for(String s:str1) {
			char ch[]=s.toCharArray();
			char rev[]= new char[ch.length];
			int k=ch.length;
			for(int i=0;i<s.length();i++) {
				k--;
				rev[k]=ch[i];
			}
			String sttt= new String(rev);
			ss[j]=sttt;
			j++;
			
		}
		for(int i=0;i<ss.length;i++) {
			System.out.print(ss[i]+" ");
		}
	}

}
