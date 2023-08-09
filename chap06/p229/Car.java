package p229;

public class Car {

	// field
	int speed;
	
	//method
	int getSpeed() {
		return this.speed; // speed? this.speed?
	}
	
	void keyTurnOn() {
		System.out.println("rotate key?");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("run(" + speed + "km/h)");
		}
	}
	
	
}
