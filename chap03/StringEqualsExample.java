package example;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "호호호";
		String strVar2 = "호호호";
		String strVar3 = new String("호호호");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		
	}
}
