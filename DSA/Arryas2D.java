package DSA;
import java.util.Scanner;
public class Arryas2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println("Enter number of columns");
		int column=sc.nextInt();
		String names[][]= new String[row][column];
		System.out.println("Enter the names");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				names[i][j]=sc.next();
			}
		}
		System.out.println("Output is ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
