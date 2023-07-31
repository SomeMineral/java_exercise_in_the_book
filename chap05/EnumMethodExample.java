package example;

public class EnumMethodExample {
	public static void main(String[] args) {
		// name()
		Week today = Week.SUN;
		String name = today.name();
		System.out.println(name);
		
		// ordinal()
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo()
		Week day1 = Week.MON;
		Week day2 = Week.WEDNES;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf();
		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATUR || weekDay == Week.SUN) {
				System.out.println("take a rest");
			} else {
				System.out.println("oh, my, goodness");
			}
		}
		
		//values()
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
		
		
	}
}
