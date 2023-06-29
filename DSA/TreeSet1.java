package DSA;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of treeset");
		int n=sc.nextInt();
		TreeSet ts=new TreeSet();
		for(int i=0;i<n;i++) {
			ts.add(sc.nextInt());
		}
		//Elements are sorted and no duplicate value is allowed
		System.out.println(ts);
		
		//Traversing the set
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		//adding element 
		ts.add(0);
		System.out.println("\n"+ts);
		
		//delete element
		ts.remove(0);
		System.out.println(ts);
	
		
	}

}
