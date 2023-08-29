package p529;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[out of (-128 ~ 127)]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("== result: " + (obj1 == obj2) );
		System.out.println("after unboxing == result: " + (obj1.intValue() == obj2.intValue()) );
		System.out.println("equals() result: " + (obj1.equals(obj2)) );
		System.out.println();
		
		System.out.println("[in (-128 ~ 127)]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== result: " + (obj3 == obj4) );
		System.out.println("after unboxing == result: " + (obj3.intValue() == obj4.intValue()) );
		System.out.println("equals() result: " + (obj3.equals(obj4)) );
		
		
		
	}
}
