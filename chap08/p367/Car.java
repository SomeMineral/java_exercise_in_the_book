package p367;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire rearLeftTire = new KumhoTire();
	Tire rearRightTire = new KumhoTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		rearLeftTire.roll();
		rearRightTire.roll();
	}
}
