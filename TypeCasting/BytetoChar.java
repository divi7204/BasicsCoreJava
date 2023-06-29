package TypeCasting;

public class BytetoChar {

	public static void main(String[] args) {
		char charValue = 'A';
		byte byteValue = 100;

		charValue = (char) byteValue;
        System.out.println("byte to char: " + charValue);
	}

}
