package p544;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = null;
		String[] formatBox = { "yyyy-MM-dd", "yyyy.MM.dd",
				"yyyy.MM.dd a HH:mm:ss", "E",
				"D", "d"};
		
		for (String format : formatBox) {
			sdf = new SimpleDateFormat(format);
			System.out.println( sdf.format(now));
		}
		
	}
}
