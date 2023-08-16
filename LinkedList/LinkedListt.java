package LinkedList;

import java.util.LinkedList;

public class LinkedListt {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();

		cars.add(0, "Volvo");
		cars.add(0, "BMW");
		cars.add(0, "Mercedes");

		for (String car: cars)
			System.out.println(car);
	}
}
