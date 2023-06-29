package DSA;
import java.util.Scanner;
public class ReverseCopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[arr.length];
		int k=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			arr1[k]=arr[i];
			k--;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
