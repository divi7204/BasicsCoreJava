package DSA;
import java.util.Scanner;
public class Arrays1D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int marks[] = new int[n];
		System.out.println("Enter student marks");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("Marks of Student");
		for(int i=0;i<n;i++) {
			System.out.println(marks[i]);
		}
	}

}
