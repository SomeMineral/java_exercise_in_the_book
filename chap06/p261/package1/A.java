package p261.package1;

public class A {
	
	// field
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("String");
	
	// constructor
	public A(boolean b) {}; //public
	A(int b) {}; // default
	private A(String s) {}; // private
}
