package p201;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("company: " + myCar.company);
		System.out.println("model: " + myCar.model);
		System.out.println("color: " + myCar.color);
		System.out.println("max speed: " + myCar.maxSpeed);
		System.out.println("speed: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("modified speed: " + myCar.speed);
		
		
	}
}
