package p552;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("y - M - d a hh : mm"); // 흠. 1개씩만 써도 되긴 한데.. 연속으로 개수 채워주면 자릿수 채워주는구만
		String nowString = now.format(dateTimeFormatter); // 헐. format에 DateTimeFormatter 넣을 수 있네 ㄷ
		System.out.println(nowString);
		
		// am pm은 시스템 설정 언어대로? 아니면 설정된 timezone에 대응되는 언어대로? 흐음. 아 몰랑.
	}
}
