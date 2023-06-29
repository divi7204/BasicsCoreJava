package OOPs;

public class DogApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		d1.name="Julie";
		d1.breed="PUG";
		System.out.println("name : "+d1.name);
		System.out.println("breed : "+d1.breed);
		d1.bark();
		Dog d2= new Dog();
		d2.name="Jonny";
		d2.breed="Pit bull";
		System.out.println("name : "+d2.name);
		System.out.println("breed : "+d2.breed);
		d2.bark();
		

	}

}
