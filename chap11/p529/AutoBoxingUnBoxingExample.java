package p529;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		
		// auto Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		// auto unboxing when assigned?
		int value = obj;
		System.out.println("value: " + value);
		
		// auto unboxing when operation?
		int result = obj + 100;
		System.out.println("result: " + result);
		
		
	}
}
