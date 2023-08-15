package Operators;

public class Operators {
	public static void main(String[] args) {
		int x = 4; // 0100
		int y = 3; // 0011
		System.out.println("x & y: " + (x & y)); // 0100 & 0011 = 0000 => 0 AND
		System.out.println("x | y: " + (x | y)); // 0100 | 0011 = 0111 => 7 OR
		System.out.println("x ^ y: " + (x ^ y)); // 0100 | 0011 = 0111 => 7 XOR
		System.out.println("x >>= y: " + (x >>= 1)); // 0100 = 0010 = 2 => Right Shift Operator
		System.out.println("x <<= y: " + (y <<= 1)); // 0011 = 0110 = 6 => Left Shift Operator
	}
}
