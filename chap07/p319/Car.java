package p319;

public class Car {
	//field
	Tire[] tires  = {
			new Tire("front-left", 6),
			new Tire("front-right", 2),
			new Tire("rear-left", 3),
			new Tire("rear-right", 4)
	};
	
	//method
	int run() {
		System.out.println("The car runs");
		for (int i=0;i<tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("The car stops");
	}
}
