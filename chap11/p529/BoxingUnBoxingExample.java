package p529;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// Boxing
		// Integer obj1 = new Integer(100); // deprecated
		// valueOf(), parseInt() 를 추천하는데..?
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.parseInt("500");
		
		// UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		
		
	}
}
