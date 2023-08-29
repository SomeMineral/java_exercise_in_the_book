package p552;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-01-01");
		System.out.println(localDate);
		System.out.println();
		
		
		// formatter에 제대로 안 넣으면 오류 발생... 헉. 안경 렌즈 교체하는 기분이네
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-01-01", formatter);
		System.out.println(localDate);
		System.out.println();
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/01/01", formatter);
		System.out.println(localDate);
		System.out.println();
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.01.01", formatter);
		System.out.println(localDate);
		System.out.println();
	}
}
