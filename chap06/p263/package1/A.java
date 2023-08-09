package p263.package1;

public class A {

	//field
	public int field1; //public
	int field2; // default
	private int field3; // private
	
	
	//constructor
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//method
	public void method1() {} // public
	void method2() {} // default
	private void method3() {} // private
	
	
}
