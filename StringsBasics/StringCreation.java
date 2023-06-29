package StringsBasics;
import java.util.Scanner;
public class StringCreation {

	public static void main(String[] args) {
		//Immutable String
		String str="Divika S";
		System.out.println(str);
		
		//Converting into uppercase
		System.out.println(str.toUpperCase());
		
		//Converting into lowercase
		System.out.println(str.toLowerCase());
		
		//finding character
		System.out.println(str.charAt(0));//d
		
		//finding the index of a particular character
		System.out.println(str.indexOf('D'));
		
		String str1=" Divika S acharya ";
		System.out.println(str1);
		
		//removing spaces using trim() method
		System.out.println(str1.trim());
		
		//spilt string using split() method
		str1.trim();
		String arr[]=str1.split(" ");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println();
		String str3="Divwz acharya s";
		char arr2[]=str3.toCharArray();
		for(char c:arr2) {
			System.out.print(c+" ");
		}
	}
	

}
