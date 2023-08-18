package p374;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("The bus runs");
	}
	
	public void checkFare() {
		System.out.println("check fare");
	}
}
