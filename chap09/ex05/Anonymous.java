package ex05;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("The bicycle runs");
		}
	};
			
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("The car runs");
			}
		};
		
		localVar.run();
	}
	
	
	void method2(Vehicle v) {
		v.run();
	}
	
}
