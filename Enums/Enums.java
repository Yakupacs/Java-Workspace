package Enums;

public class Enums {
	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String[] args) {
		Level myLevel = Level.MEDIUM;

		System.out.println(myLevel.hashCode()); // 1933863327
		System.out.println(myLevel.name()); // MEDIUM
		System.out.println(myLevel.toString()); // MEDIUM
		System.out.println(myLevel.describeConstable()); // Optional[EnumDesc[Enums$Level.MEDIUM]]

		switch (myLevel) {
			case LOW:
				System.out.println("Warning! Your level Low!");
				break;
			case MEDIUM:
				System.out.println("Warning! Your level Medium!");
				break;
			case HIGH:
				System.out.println("Warning! Your level High!");
				break;
			default:
				break;
		}
	}
}
