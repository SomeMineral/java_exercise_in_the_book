package p302;

public class Car {
	// field
	public int speed;
	
	//method
	public void speedUp() {
		speed += 1;
	}
	
	//final method
	public final void stop() {
		System.out.println("car is stopped");
		speed = 0;
	}
	
}
