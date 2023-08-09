package p229;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("current speed: " + speed + "km/h");
	}
}
