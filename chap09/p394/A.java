package p394;


// outer class 
public class A {
	// constructor of A
	A() { System.out.println("A object is created"); }
	
	
	// instance member class
	class B {
		// constructor of B
		B(){ System.out.println("B object is created"); }
		
		int field1;
		static int field2;
		void method1() { System.out.println("B's method1"); }
		static void method2() { System.out.println("B's method2 (static)"); }
	}
	
	// static member class
	static class C {
		C(){ System.out.println("C object is created"); }
		int field1;
		static int field2;
		void method1() { System.out.println("C's method1"); }
		static void method2() { System.out.println("C's method2 (static)"); }
	}
	
	void method() {
		//local class
		class D{
			D(){ System.out.println("D object is created"); }
			int field1;
			static int field2;
			void method1() { System.out.println("D's method1"); }
			static void method2() { System.out.println("D's method2 (static)"); }
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		
		System.out.println("=====");
		System.out.println(D.field2);
		D.method2();
		System.out.println("=====");
	}
	
	// 옛날 책이라 그런가... static 넣어도 잘 나오는데...
}
