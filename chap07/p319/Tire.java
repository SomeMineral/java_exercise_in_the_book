package p319;

public class Tire {
	// field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	// constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire left: " + (maxRotation-accumulatedRotation) + " time(s)");
			return true;
		} else {
			System.out.println("*** " + location + " Tire is broken ***");
			return false;
		}
	}
}
