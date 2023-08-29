package ex13;

// import java.text.SimpleDateFormat; // Date만 쓸 수 있나봐...
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// import java.util.Date; // 비추

public class DatePrintExample {
	
	public static void main(String[] args) {
		
		//Date now = new Date(); // 이거 외엔 대부분 deprecated... 거기다가 get~~ set~~ method들도 죄다 deprecated..
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd E a hh:mm");
		
		String nowStr = now.format(dtf);
		System.out.println(nowStr);
		
		//와.. 이거 어렵구만!
	}
}
