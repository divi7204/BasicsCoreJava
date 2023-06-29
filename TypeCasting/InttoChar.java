package TypeCasting;

public class InttoChar {

	public static void main(String[] args) {
		int intValue = 1000;
        char charValue = 'A';
		charValue = (char) intValue;
        System.out.println("int to char: " + charValue);
	}

}
