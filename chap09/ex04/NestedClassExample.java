package ex04;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//Car.Tire tire = myCar.new Tire();
		Car.Tire tire = new Car().new Tire(); // 아. 이것도 되는구나.
		tire.test();
		
		Car.Engine engine = new Car.Engine(); // static 참 말썽이네.
		engine.test();
	}
}
