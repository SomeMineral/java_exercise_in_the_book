package p314;

public class Car {
	//field
	Tire frontLeftTire = new Tire("front-left", 6);
	Tire frontRightTire = new Tire("front-right", 2);
	Tire rearLeftTire = new Tire("rear-left", 3);
	Tire rearRightTire = new Tire("rear-right", 4);
	
	//method
	int run() {
		System.out.println("The car runs.");
		if (frontLeftTire.roll() == false) { stop(); return 1;}
		if (frontRightTire.roll() == false) { stop(); return 2;}
		if (rearLeftTire.roll() == false) { stop(); return 3;}
		if (rearLeftTire.roll() == false) { stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("The car stops.");
	}
}
