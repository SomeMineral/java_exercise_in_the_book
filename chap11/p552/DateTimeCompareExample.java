package p552;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 5, 15, 14, 0, 0);
		System.out.println("start time: " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2023, 11, 30, 13, 15, 0);
		System.out.println("end time: " + endDateTime + "\n");
		
		
		
		if (startDateTime.isBefore(endDateTime)) {
			System.out.println(" i n g . . .\n");
		} else if (startDateTime.isEqual(endDateTime)) {
			System.out.println(" finish\n");
		} else if (startDateTime.isAfter(endDateTime)) {
			System.out.println(" finished\n");
		}
		
		
		// ver.1
		System.out.println("[ the time remained to the end of exmaple setting??]"); // 영어 어려워..
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
			// Or
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("left years: " + remainYear);
		System.out.println("left months: " + remainMonth);
		System.out.println("left days: " + remainDay);
		System.out.println("left hours: " + remainHour);
		System.out.println("left minutes: " + remainMinute);
		System.out.println("left seconds: " + remainSecond + "\n");
		
		
		// ver.2
		System.out.println("[ the time remained to the end of exmaple setting??]");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		String periodStr = "" + period.getYears() + "-" + period.getMonths() + "-" + period.getDays();
		System.out.println(periodStr + "\n");
		
		Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("left seconds: "+ duration.getSeconds());
		
	}
}
