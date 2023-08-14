package p302;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/* cannot override
	@Override
	public void stop() {
		System.out.println("SportsCar is stopped");
		speed = 0;
	}
	*/
}
