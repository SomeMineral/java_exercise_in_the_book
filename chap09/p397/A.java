package p397;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 11;
			method1();
			
			field2 = 22;
			method2();
		}
	}
	
	static class C { // A class 생성되면서 static도 함께 생성.. 근데 field1, method1은 아직 없음.
		void method() {
			// field1 = 33;
			// method1();
			
			field2 = 44;
			method2();
		}
	}
}
