package Strings;

public class Strings {
	public static void main(String[] args) {
		String myString = "Hello World and Yakup!";

		System.out.println(myString.toUpperCase()); // "HELLO WORLD AND YAKUP!"
		System.out.println(myString.toLowerCase()); // "hello world and yakup!"
		System.out.println(myString.indexOf("and")); // 12
		System.out.println(myString.concat(myString)); // "Hello World and Yakup!Hello World and Yakup!"
		System.out.println("We are the so-called \"Vikings\" from the north.");
		System.out.println("We are the so-called \'Vikings\' from the north.");
		System.out.println("We are \\the best!");
	}
}
