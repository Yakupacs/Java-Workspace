package Arrays;

public class Arrays {
	public static void main(String[] args) {
		// String Array
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		String[] copyCars = cars.clone();
		System.out.println(cars.length); // 4
		System.out.println(cars.hashCode()); // 622488023
		System.out.println(cars.equals(copyCars)); // false
		System.out.println(cars.equals(cars)); // true
		for (String car : cars)
		{
			System.out.println("My car is " + car);
		}

		// Int Array
		int[] exams = {70, 60, 100};

		for (int exam : exams)
		{
			System.out.println("My exam is " + exam);
		}
		exams[2] = 42;
		for (int exam : exams)
		{
			System.out.println("My new exam is " + exam);
		}

		// Multidimensiol Array
		int[][] schoolExams = { {50, 60, 90}, {30,50,90}};

		for (int[] schoolExam: schoolExams)
			for (int exam: schoolExam)
				System.out.println(exam);
	}
}
