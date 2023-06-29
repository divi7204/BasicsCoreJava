package DSA;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueue1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PriorityQueue pq= new PriorityQueue();
		System.out.println("Enter the size of queue");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			pq.add(sc.nextInt());
		}
		//Printing the priorityQueue
		System.out.println(pq);
		
		//Adding element at last
		System.out.println(pq.add(9)); //true
		System.out.println(pq);
		
		//Traversing through priorityqueue
		Iterator itr= pq.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
