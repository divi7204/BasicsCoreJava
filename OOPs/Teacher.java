package OOPs;

public class Teacher {
	String name;
	String sub;
	int salary;
	Teacher(String name,String sub,int salary){
		this.name=name;
		this.sub=sub;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println(this.name+" "+this.sub+" "+this.salary);
	}

}
