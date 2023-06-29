package DSA;
import java.util.Scanner;
public class ArrayBasics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Taking length of the array
		System.out.println("Enter the size of the array");
		int num=sc.nextInt();
		
		//Creating array with the entered length
		int arr[]= new int[num];
		
		//Taking input from user
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The entered array elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("=================================");
		System.out.println("Enter 2nd arrya length");
		int num2=sc.nextInt();
		float arr1[]=new float[num2];
		//Taking input from user
			System.out.println("Enter the elements");
			for(int i=0;i<num2;i++) {
					arr1[i]=sc.nextFloat();
			}
		System.out.println("The entered array elements are");
		for(int i=0;i<arr1.length;i++) {
				System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("===================================");
		System.out.println("Enter 3rd arrya length");
		String str[]= new String[sc.nextInt()];
		System.out.println("Enter the array element");
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		System.out.println("The array elements are ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
