package p552;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

// 와. 엄청 많네. java.time.* 쓰는 게 낫겠구나...


public class DateTimeCreateExample {
	public static void main(String[] args) throws InterruptedException {
		// get date
		LocalDate currDate = LocalDate.now();
		System.out.println("current date: " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("target date: " + targetDate);
		System.out.println();
		
		// get time
		LocalTime currTime = LocalTime.now();
		System.out.println("current time: " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("target time: " + targetTime);
		System.out.println();
		
		// get date & time
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("current date & time: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("target date & time: " + targetDateTime);
		System.out.println();
		
		// UTC and timezone
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("UTC: " + utcDateTime);
		
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("New York timezone: " + newyorkDateTime);
		System.out.println();
		
		// certain timestamp
		Instant instant1 = Instant.now();
		Thread.sleep(10); // 정확히 10ms는 아닌가보네.. 흑.
		Instant instant2 = Instant.now();
		if (instant1.isBefore(instant2)) {
			System.out.println("instant1 is earlier");
		} else {
			System.out.println("instant1 is later");
		}
		
		System.out.println("difference(nanosecond): " + instant1.until(instant2, ChronoUnit.NANOS));
		
		
	}
}
