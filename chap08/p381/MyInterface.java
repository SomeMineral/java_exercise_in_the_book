package p381;

public interface MyInterface {
	public void method1();
	
	// after MyClassA is created, this is added
	public default void method2() {
		System.out.println("MyInterface - method2() is activated");
	}
}
