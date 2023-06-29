package TypeCasting;

public class ChartoShort {

	public static void main(String[] args) {
		short shortValue = 500;
        char charValue = 'A';
        shortValue = (short) charValue;
        System.out.println("char to short: " + shortValue);
	}

}
