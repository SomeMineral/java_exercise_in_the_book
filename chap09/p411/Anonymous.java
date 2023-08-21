package p411;

public class Anonymous {
	// initial value of a field?
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("turn on the TV");
		}
		@Override
		public void turnOff() {
			System.out.println("turn off th TV");
		}
	};
	
	void method1() {
		// local parameter?
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("turn on the TV");
			}
			@Override
			public void turnOff() {
				System.out.println("turn off th TV");
			}
		};
		
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
