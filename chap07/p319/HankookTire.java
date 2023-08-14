package p319;

public class HankookTire extends Tire{
	//constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire left: " +
				(maxRotation - accumulatedRotation) + " time(s)");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire is broken ***");
			return false;
		}
	}
}
