package DSA;
import java.util.Scanner;
public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arr[]= new int[sc.nextInt()];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("The sum is "+sum);
	}

}
