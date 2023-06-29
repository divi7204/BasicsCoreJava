package OOPs;
import java.util.Scanner;
public class Encapsulation {
	private int age=0;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name");
	Encapsulation e=new Encapsulation();
	String name=sc.next();
	e.setName(name);
	System.out.println("Enter your age");
	int age=sc.nextInt();
	e.setAge(age);
	System.out.println("Name "+e.getName()+" Age "+e.getAge());
	}

}
