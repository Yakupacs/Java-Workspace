package LinkedList;

import java.util.LinkedList;

public class LinkedListt {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();

		cars.add(0, "Volvo");
		cars.add(0, "BMW");
		cars.add(0, "Mercedes");
		cars.addFirst("Audi");
		cars.addFirst("Citroen");
		cars.addLast("Renault");
		
		int i = 0;
		for (String car: cars)
		{
			i++;
			System.out.println(i + ". " + car);
		}

		if (cars.contains("Citroen"))
			System.out.println("Citroen added.");
		else
			System.out.println("Citroen is not added.");

	}
}
