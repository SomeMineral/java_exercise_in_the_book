package p497;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("hohoho");
		String strVar2 = "hohoho";
		
		if (strVar1 == strVar2) {
			System.out.println("they refer to same object");
		} else {
			System.out.println("they don't refer to same object");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("they have same string");
		} else {
			System.out.println("thet do not have same string");
		}
	}
}
