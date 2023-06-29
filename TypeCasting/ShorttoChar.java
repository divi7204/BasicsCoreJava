package TypeCasting;

public class ShorttoChar {

	public static void main(String[] args) {
		short shortValue = 500;
        char charValue = 'A';
		charValue = (char) shortValue;
        System.out.println("short to char: " + charValue);
	}

}
