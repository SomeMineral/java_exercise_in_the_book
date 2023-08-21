package p396;

public class A {
	
	// instance field
	B field1 = new B();
	C field2 = new C();
	
	// instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// initialize static field
	// static B field3 = new B();  B is only valid in A's instance
	static C field4 = new C();
	
	//static method
	static void method2() {
		// B var1 = new B();   B is only valid in A's instance
		C var2 = new C();
	}
	
	
	// instance member class
	class B {}
	
	// static member class
	static class C {}
}
