package OOPs;

public class CarApp {

	public static void main(String[] args) {
		Car obj= new Car();
		obj.brand="maruthi";
		obj.color="red";
		obj.price=120000;
		System.out.println("Brand : "+obj.brand);
		System.out.println("Color : "+obj.color);
		System.out.println("Price : "+obj.price);
		
		obj.accelarate();

	}

}

