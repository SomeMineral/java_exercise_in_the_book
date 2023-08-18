package p374;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); // there's no checkFare method in vehicle. only in the bus
		
		System.out.println();
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
