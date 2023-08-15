package ControlStatements;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 42; i++)
		{
			System.out.print(i + " ");
		}

		System.out.println();

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String car : cars)
			System.out.print(car + " ");

	}
}
