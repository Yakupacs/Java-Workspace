package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		System.out.println("Now date is " + myObj); // Now date is 2023-08-16

		myObj = LocalDate.of(2000, Month.APRIL, 9);
		System.out.println("My birthday date is " + myObj); // My birthday date is 2000-04-09

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime time = LocalDateTime.now();
		String formattedDate = time.format(myFormatObj);
		System.out.println("Now time is " + formattedDate); // Now time is 16-08-2023 12:19:39

		myFormatObj = DateTimeFormatter.ofPattern("MM-yyyy-dd ss:mm:HH");
		time = LocalDateTime.now();
		formattedDate = time.format(myFormatObj);
		System.out.println("Now time is " + formattedDate); // Now time is 08-2023-16 39:19:12
	}
}
