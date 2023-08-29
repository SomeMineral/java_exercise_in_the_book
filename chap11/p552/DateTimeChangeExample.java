package p552;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

// 이건.. 정말 필요할 때나 찾아볼 것 같은 기능인데.. 아직 일을 안 해봐서 모르겠다.
public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("current datetime: " + now + "\n");
		
		LocalDateTime targetDateTime = null;
		
		// change directly
		targetDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(20)
				.withHour(15)
				.withMinute(17)
				.withSecond(33);
		System.out.println("direct change: " + targetDateTime + "\n");
		
		// change year relatively?
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("the first day of this year: " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("the last day of this year: " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("the first day of next year: " + targetDateTime + "\n");
		
		// change month relatively?
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("the first day of this month: " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("the last day of this month: " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("the first day of next month: " + targetDateTime + "\n");
		
		// change day relatively?
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("the first monday of this month: " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("next monday: " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("last monday: " + targetDateTime + "\n");
		
		
		
		
		
	}
}
