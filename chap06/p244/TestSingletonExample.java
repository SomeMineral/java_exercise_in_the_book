package p244;

public class TestSingletonExample {
	public static void main(String[] args) {
		/*
		 TestSingleton obj1 = new TestSingleton(); // error
		 TestSingleton obj2 = new TestSingleton(); // error
		 */
		
		TestSingleton obj1 = TestSingleton.getInstance();
		TestSingleton obj2 = TestSingleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("same object");
		} else {
			System.out.println("different object");
		}
	}
}
