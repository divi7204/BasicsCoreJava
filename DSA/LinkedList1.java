package DSA;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l= new LinkedList();
		System.out.println("Enter the size of LinkedList");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			l.add(sc.nextInt());
		}
		System.out.println("The original LinkedList "+l);
		
		//adding new data to LinkedList
		l.add(9);
		System.out.println(l);
		
		//Printing all the elements of LinkedList
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
		
		//adding element
		l.add(1, 9);
		System.out.println(l);
		
		//getting element
		System.out.println(l.get(1));//9
		
		//checking the data present or not
		System.out.println(l.contains(9)); //true
		
		//Getting only first element data
		System.out.println(l.peek());
		
		//Getting first element and deleting first element
		System.out.println(l.poll());
		System.out.println(l);
	}

}
