package p552;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println();
		
		String strDateTime = now.getYear() + "-";
		strDateTime += now.getMonthValue() + "-";
		strDateTime += now.getDayOfMonth() + " ";
		strDateTime += now.getDayOfWeek() + " ";
		strDateTime += now.getHour() + ":";
		strDateTime += now.getMinute() + ":";
		strDateTime += now.getSecond() + ".";
		strDateTime += now.getNano();
		System.out.println(strDateTime + "\n");
		
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("Febuary 29 exists in this year\n");
		} else {
			System.out.println("Febuary 29 doesn't exist in this year\n");
		}
		
		// UTC , zoneoffset?
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("UTC: " + utcDateTime + "\n");
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("Seoul timezone: " + seoulDateTime + "\n");
		
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("Seoul zoneID: " + seoulZoneId + "\n");
		
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("Seoul zoneOffset: " + seoulZoneOffset + "\n");
		
	}
}
