package Variables;
public class Variables {
    public static void main(String[] args) {
		String myString = "My string!";
		char myChar = 'A';
		int myInt = 100;
		final int myFinalInt = 100; // read-only = final
		double myDouble = 10.10;
		float myFloat = 10.10f;
		boolean myBool = true;

		System.out.println(myString + myInt);
		System.out.println("Hello " + myString);
		System.out.println(myFinalInt);
		System.out.println(myFloat);
		System.out.println(myBool);
		System.out.println(myChar);
		System.out.println(myDouble);
		System.out.println(myDouble + myChar);
    }
}
