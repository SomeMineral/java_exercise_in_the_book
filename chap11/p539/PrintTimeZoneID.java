package p539;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		int count = 0;
		for (String id : availableIDs) {
			System.out.println(id);
			count++;
			
			if (count > 10) {
				break;
			}
		}
	}
}
