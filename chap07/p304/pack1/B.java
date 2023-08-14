package p304.pack1;

public class B {
	public void method() {
		A a = new A(); // same package
		a.field = "value"; // same package
		a.method(); // same package
	}
}
