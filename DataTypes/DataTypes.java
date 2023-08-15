package DataTypes;

public class DataTypes {
	public static void main(String[] args) {
		byte myByte = -127; // -128 to 127
		System.out.println(myByte);

		short myShort = 5000; // -32768 to 34767
		System.out.println(myShort);

		int myInt = 214748364_7; // -2147483648 to 2147483647
		System.out.println(myInt);

		long myLong = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
		System.out.println(myLong);

		float myFloat = 12.987654321f;
		System.out.println(myFloat); // 12.987655

		double myDouble = 12.98765432123456789d;
		System.out.println(myDouble); // 12.987654321234569

		float f1 = 1.111e6f;
		System.out.println(f1); // 1111000.0

		double d1 = 12E5d;
		System.out.println(d1); // 1200000.0
	}
}
