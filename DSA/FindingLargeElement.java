package DSA;
import java.util.Scanner;
public class FindingLargeElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int max=0;
		int arr[]= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The maximum element is "+ max);
		System.out.println("The minimum element is "+ min);
	}

}
