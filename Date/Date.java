package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		System.out.println("Now date is " + myObj);

		myObj = LocalDate.of(2000, Month.APRIL, 9);
		System.out.println("My birthday date is " + myObj);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime time = LocalDateTime.now();
		String formattedDate = time.format(myFormatObj);
		System.out.println("Now time is " + formattedDate);
	}
}
