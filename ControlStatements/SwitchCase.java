package ControlStatements;

public class SwitchCase {
	public static void main(String[] args) {
		String today = "Wednesday";
		switch (today) {
			case "Monday":
				System.out.println("Happy Monday!");
				break;
			case "Tuesday":
				System.out.println("Happy Tuesday!");
				break;
			case "Wednesday":
				System.out.println("Happy Wednesday!");
				break;
			case "Thursday":
				System.out.println("Happy Thursday!");
				break;
			case "Friday":
				System.out.println("Happy Friday!");
				break;
			case "Saturday":
				System.out.println("Happy Saturday!");
				break;
			case "Sunday":
				System.out.println("Happy Pazar!");
				break;
			default:
				System.out.println("I don't know.");
				break;
		}
	}
}
