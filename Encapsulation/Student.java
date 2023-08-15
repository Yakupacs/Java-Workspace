package Encapsulation;

public class Student
{
	private String firstName;
	private String lastName;
	private double midtermScore;
	private double quizScore;
	private double finalScore;

	public Student(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMidtermScore(double midtermScore) {
		this.midtermScore = midtermScore;
	}
	public void setQuizScore(double quizScore) {
		this.quizScore = quizScore;
	}
	public double getFinalScore() {
		return finalScore;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getMidtermScore() {
		return midtermScore;
	}
	public double getQuizScore() {
		return quizScore;
	}
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	public double calculateAverage()
	{
		return (midtermScore + quizScore + finalScore) / 3;
	}
	public String getGrade()
	{
		double average = calculateAverage();

		if (average >= 90)
			return "A";
		else if (average >= 80)
			return "B";
		else if (average >= 70)
			return "C";
		else if (average >= 60)
			return "D";
		else
			return "F";
	}
}
