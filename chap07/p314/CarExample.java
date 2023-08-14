package p314;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("front-left tire changes to HankookTire");
				car.frontLeftTire = new HankookTire("front-left", 15);
				break;
			case 2:
				System.out.println("front-right tire changes to KumhoTire");
				car.frontRightTire = new KumhoTire("front-right", 13);
				break;
			case 3:
				System.out.println("rear-left tire changes to HankookTire");
				car.rearLeftTire = new HankookTire("rear-left", 14);
				break;
			case 4:
				System.out.println("rear-right tire changes to KumhoTire");
				car.rearRightTire = new HankookTire("rear-right", 15);
				break;
			}
			System.out.println("-----------------------------------------------------------");
		}
	}
}
