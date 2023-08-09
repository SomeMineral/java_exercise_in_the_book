package p263.package2;


import p263.package1.A;


public class C {
	public C() {
		A a = new A();
		a.field1 = 1; // public ok
		//a.field2 = 1; // default, different package, no
		//a.field3 = 1; // private, no
		
		a.method1(); // public ok
		//a.method2(); // default, defferent package, no
		//a.method3(); // private, no
	}
}
