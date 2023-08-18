package p367;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println();
		myCar.frontLeftTire = new KumhoTire(); // myCar's field
		myCar.frontRightTire = new KumhoTire(); // myCar's field
		
		myCar.run();
	}
}
