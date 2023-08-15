package Encapsulation;

public class Main
{
	public static void main(String[] args) {
	Student student = new Student("Yakup", "Açış");
	student.setMidtermScore(35);
	student.setQuizScore(75);
	student.setFinalScore(80);

	System.out.println("Student Name: " + student.getFullName());
	System.out.println("Average Score: " + student.calculateAverage());
	System.out.println("Final Grade: " + student.getGrade());
	}
}

