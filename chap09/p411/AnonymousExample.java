package p411;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//anonymous object field
		anony.field.turnOn();
		System.out.println();
		
		//anonymous object local variable? 영어 어렵다..
		anony.method1();
		System.out.println();
		
		//anonymous object parameter
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("Turn on the smart TV");
				}
				@Override
				public void turnOff() {
					System.out.println("Turn off the smart TV");
				}
			}
		);
		
	}
}
