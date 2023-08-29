package p539;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		System.out.print(year + "-");
		System.out.print(month + "-");
		System.out.println(day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		// 언어마다 요일에 할당된 숫자가 다른데.. 하나한 고민하기 귀찮잖아?
		// 그래서 Calendar.MONDAY와 같이 각 요일에 해당하는 숫자를 저런 변수값? 필드값? 으로 설정해뒀구만.
		
		String strWeek = null;
		
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "MON";
			break;
		case Calendar.TUESDAY:
			strWeek = "TUES";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "WED";
			break;
		case Calendar.THURSDAY:
			strWeek = "THU";
			break;
		case Calendar.FRIDAY:
			strWeek = "FRI";
			break;
		case Calendar.SATURDAY:
			strWeek = "SATUR";
			break;
		default:
			strWeek = "SUN";
		}
		
		System.out.println(strWeek);	
		
		int amPm = now.get(Calendar.AM_PM);
		// 마찬가지로 am, pm에 할당된 숫자로 고생하지 말라고..
		
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "AM";
		} else {
			strAmPm = "PM";
		}
		
		System.out.print(strAmPm + " ");
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(hour+":");
		System.out.print(minute+":");
		System.out.println(second);
		
	}
}
