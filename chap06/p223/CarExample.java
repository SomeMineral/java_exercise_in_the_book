package p223;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("go");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {
			System.out.println("enough gas");
		} else {
			System.out.println("input gas");
		}
		
		
	
	}
}
