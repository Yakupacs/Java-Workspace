package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Opel");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add("Tesla");

		cars.remove(2);
		Collections.sort(cars);

		for (String car: cars)
			System.out.println(car);
	}
}
