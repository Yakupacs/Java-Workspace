package Variables;
public class Main {
    public static void main(String[] args) {
		String myString = "My string!";
		char myChar = 'I';
		int myInt = 42;
		final int myFinalInt = 422; // read-only = final
		double myDouble = 42.42;
		float myFloat = 42.42f;
		boolean myBool = true;

		System.out.println("Hello " + myInt);
		System.out.println("Hello " + myString);
		System.out.println(myFinalInt);
		System.out.println(myFloat);
		System.out.println(myBool);
		System.out.println(myChar);
		System.out.println(myDouble);
    }
}
