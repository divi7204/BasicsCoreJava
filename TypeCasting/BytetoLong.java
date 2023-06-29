package TypeCasting;

 public class BytetoLong {

	public static void main(String[] args) {
		byte byteValue = 100;
		long longValue = 1000000L;
		longValue = byteValue;
        System.out.println("byte to long: " + longValue);
	}

}
