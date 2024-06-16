package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task_09_Hometask_DateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		// 1. Write a predicate to check if the given date is yesterday date
		Predicate<LocalDate> isYesterday = date -> date.equals(today.minusDays(1));
		LocalDate testDate1 = today.minusDays(1);
		LocalDate testDate2 = today.minusDays(2);
		System.out.println("Is " + testDate1 + " yesterday? " + isYesterday.test(testDate1));
		System.out.println("Is " + testDate2 + " yesterday? " + isYesterday.test(testDate2));

		// 2. Write a Supplier to get Date for next Thursday
		Supplier<LocalDate> nextThursday = () -> today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("Next Thursday is: " + nextThursday.get());

		// 3. Write a Supplier to get CurrentTime in EST timezone
		Supplier<String> currentTimeInEST = () -> {
			LocalDateTime now = LocalDateTime.now(ZoneId.of("America/New_York"));
			return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		};
		System.out.println("Current time in EST timezone: " + currentTimeInEST.get());

		// 4. Write a Function to calculate the age of a person given date of birth
		Function<LocalDate, Integer> calculateAge = birthDate -> {
			LocalDate todayDate = LocalDate.now();
			return Period.between(birthDate, todayDate).getYears();
		};
		LocalDate dob = LocalDate.of(1991, 8, 26); 
		System.out.println("Age based on date of birth " + dob + " is: " + calculateAge.apply(dob));
	}
}
