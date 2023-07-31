package example;

public class StringEqualsExample {
	public static void main(String[] args) {
	String strVar1 = "my life for aiur";
	String strVar2 = "my life for aiur";
	
	if (strVar1 == strVar2) {
		System.out.println("참조 같음");
	} else {
		System.out.println("참조 다름");
	}
	
	if(strVar1.equals(strVar2)) {
		System.out.println("문자열 같음");
	}
	
	String strVar3 = new String("my life for aiur");
	String strVar4 = new String("my life for aiur");
	
	if (strVar3 == strVar4) {
		System.out.println("참조 같음");
	} else {
		System.out.println("참조 다름");
	}
	
	if(strVar3.equals(strVar4)) {
		System.out.println("문자열 같음");
	}
	
	}
}
