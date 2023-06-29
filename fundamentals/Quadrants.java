package fundamentals;
import java.util.Scanner;
public class Quadrants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 points x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.print("Quadrant is ");
		if(x==0&&y==0) {
			System.out.println(" Origin");
		}
		else if(x==0&&y>0||x==0&&y<0) {
			System.out.println(" on X axis");
		}
		else if(y==0&&x>0||y==0&&x<0) {
			System.out.println(" on Y axis");
		}
		else if(x>0&&y>0) {
			System.out.println(" on 1st quadrant");
		}
		else if(x<0&&y>0) {
			System.out.println(" on 2nd quadrant");
		}
		else if(x<0&&y<0) {
			System.out.println(" on 3rd quadrant");
		}
		else if(x>0&&y<0) {
			System.out.println(" on 4th quadrant");
		}
	}

}
