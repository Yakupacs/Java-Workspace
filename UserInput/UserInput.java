package UserInput;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = myObj.nextLine();

		System.out.print("Enter age: ");
		int age = myObj.nextInt();

		System.out.print("Enter height: ");
		double height = myObj.nextDouble();

		System.out.println("Name " + name + ", age " + age + ", height " + height);

		myObj.close();

		// nextBoolean()
		// nextByte()
		// nextDouble()
		// nextFloat()
		// nextInt()
		// nextLine()
		// nextLong()
		// nextShort()
	}
}
