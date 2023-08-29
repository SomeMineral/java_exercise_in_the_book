package p465;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("google", "android");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
	}
}
