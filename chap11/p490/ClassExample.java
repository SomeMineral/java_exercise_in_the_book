package p490;

public class ClassExample {
	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		
		
		try {
			Class clazz2 = Class.forName("p472.Counter");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// Ah. Nested class.. 어렵네. static 안 쓰면 쓰지 못하는구나..
	static class Car{
		Car() {}
	}
}

