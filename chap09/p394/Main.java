package p394;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println("");
		
		// create instance member class object
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println(A.B.field2);
		A.B.method2();
		System.out.println("------------------");
		System.out.println("");
		
		// create static member class object
		A.C c = new A.C();
		c.field1 = 4;
		c.method1();
		A.C.field2 = 5;
		A.C.method2();
		
		System.out.println("");
		
		// method call for the creation of local class object 
		a.method();
	}
}
