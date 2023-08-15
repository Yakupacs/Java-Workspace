package StudentInformationSystem;

public class StudentInformationSystem
{
	public static void main(String[] args) {
	Student student = new Student("John", "Doe");
	student.setMidtermScore(85);
	student.setQuizScore(75);
	student.setFinalScore(90);

	System.out.println("Student Name: " + student.getFullName());
	System.out.println("Average Score: " + student.calculateAverage());
	System.out.println("Final Grade: " + student.getGrade());
	}
}

