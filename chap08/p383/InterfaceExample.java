package p383;

public class InterfaceExample {
	public static void main(String[] args) {
		ParentInterface pi = null;
		
		// there's no implementation!
		ChildInterface1 ci1 = new ChildInterface1() {
			
			// from ParentInterface
			@Override
			public void method1() {
				System.out.println("ChildInterface1 - method1()");
			}
			
			// from ChildInterface1
			@Override
			public void method3() {
				System.out.println("ChildInterface1 - method3()");
			}
			
		};
		
		ci1.method1(); 
		ci1.method2();
		ci1.method3();
		System.out.println();
		
		
		// there's no implementation!
		ChildInterface2 ci2 = new ChildInterface2() {
			
			// from ParentInterface
			@Override
			public void method1() {
				System.out.println("ChildInterface2 - method1()");
			}
			
			// from ChildInterface2
			@Override
			public void method3() {
				System.out.println("ChildInterface2 - method3()");
			}
			
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		System.out.println();

		// there's no implementation!
		ChildInterface3 ci3 = new ChildInterface3() {
			
			// from ParentInterface
			@Override
			public void method1() {
				System.out.println("ChildInterface3 - method1()");
			}
			
			// from ChildInterface3
			@Override
			public void method2() {
				System.out.println("ChildInterface3 - method2()");
			}
			// from ChildInterface3
			@Override
			public void method3() {
				System.out.println("ChildInterface3 - method3()");
			}	
				};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
		System.out.println();		
	
	}
}
