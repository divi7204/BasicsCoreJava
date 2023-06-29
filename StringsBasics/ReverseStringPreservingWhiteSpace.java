package StringsBasics;
import java.util.Scanner;
public class ReverseStringPreservingWhiteSpace {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str= sc.nextLine();
	char c[]= str.toCharArray();
	char rev[]= new char[c.length];
	int k=c.length;
	int count=0;
	//Reversing the String
	for(int i=0;i<c.length;i++) {
		k--;
		rev[k]=c[i];
		if(c[i]==' '){
			count=i;
		}
	}
	//Adding white space at a particular index
	for(int i=0;i<rev.length;i++) {
		if(i==count) {
			rev[i]=' ';
		}
		else if(rev[i]==' ') {
			int j=i;
			while(j<=count) {
				rev[j]=rev[j+1];
				j++;
			}
		}
		
	}
	String s= new String(rev);
	System.out.println(s);
	
	}

}
