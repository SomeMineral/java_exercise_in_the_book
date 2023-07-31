package example;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // Sun : 1
		
		switch(week) {
		case 1:
			today = Week.SUN;
			break;
		case 2:
			today = Week.MON;
			break;
		case 3:
			today = Week.TUES;
			break;
		case 4:
			today = Week.WEDNES;
			break;
		case 5:
			today = Week.THURS;
			break;
		case 6:
			today = Week.FRI;
			break;
		case 7:
			today = Week.SATUR;
			break;
		}
		
		System.out.println("today: " + today);
		
		if (today == Week.SUN) {
			System.out.println("sleep on sunday.");
		} else {
			System.out.println("study java. T^T");
		}
		
		Week var1 = Week.SUN;
		Week var2 = Week.SUN;
		
		System.out.println(var1 == var2);
		
		
	}

}
