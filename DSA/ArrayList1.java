package DSA;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		//creating ArrayList class object
		ArrayList a= new ArrayList();
		
		//Taking size of array
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		//Taking elements from user and storing it in ArrayList. Here only int type is taken as input
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			a.add(temp);
		}
		System.out.println(a);
		
		//Getting the element by index number
		System.out.println(a.get(2));  
		
		//Setting the element at index
		a.set(1, false);
		System.out.println(a);
		
		//Adding element at particular index
		a.add(1,6);
		System.out.println(a);
		
		//You can add ArrayList to another ArrayList using addAll() method
		//To add food to veg ArrayList => veg.addAll(food);
		
		
		//Using iterator to traverse throughout the arraylist
		Iterator itr= a.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
