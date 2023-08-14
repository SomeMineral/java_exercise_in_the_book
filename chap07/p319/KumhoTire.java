package p319;

public class KumhoTire extends Tire{
	//constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire left: " +
				(maxRotation - accumulatedRotation) + " time(s)");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire is broken ***");
			return false;
		}
	}
}
