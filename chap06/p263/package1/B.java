package p263.package1;

public class B {
	public B() {
		A a = new A();
		
		a.field1 = 1; // public ok
		a.field2 = 1; // default, same package ok
		//a.field3 = 1; // private no.
		
		a.method1(); // public ok
		a.method2(); // default, same package ok
		//a.method3(); // private no
	}
}
