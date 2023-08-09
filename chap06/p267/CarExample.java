package p267;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		
		System.out.println("current speed : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("current speed : " + myCar.getSpeed());
	}
}
