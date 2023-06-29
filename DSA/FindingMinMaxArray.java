package DSA;
import java.util.Scanner;
import java.util.*;
public class FindingMinMaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[] = {10,5,15};
		Arrays.sort(arr);
		int count=0;
		int mini=arr[0];
		int maxi=arr[arr.length-1];
		System.out.println(mini);
		System.out.println(maxi);
		if(mini<=0) {
			mini=0;
		}
		int k=0;
		for(int i=mini;i<maxi;i++) {
			if(i==arr[k]) {
				k++;
			}
			else {
				count++;
			}
		}
		System.out.println(count);
	}

}
