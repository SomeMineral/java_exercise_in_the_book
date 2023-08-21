package p399;

public class Outter {
	//before JAVA7
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 2;
		//localVariable = 3;
		class Inner {
			public void method() {
				int result = arg + localVariable;
				System.out.println("result(" + result + ") = arg(" + arg + ") + localVariable(" + localVariable + ")");
				System.out.println();
			}
		}
		
		Inner in1 = new Inner();
		in1.method();
		
	}
	
	//after JAVA8
	public void method2(int arg) {
		int localVariable = 4;
		//arg = 5; // 여기까진 써도 오류 표시 안 붙는데 아래 result에서 사용하려고 하니 바로 오류 뜨네.
		//localVariable = 6; // 여기까진 써도 오류 표시 안 붙는데 아래 result에서 사용하려고 하니 바로 오류 뜨네.
		class Inner {
			public void method() {
				int result = arg + localVariable;
				System.out.println("result(" + result + ") = arg(" + arg + ") + localVariable(" + localVariable + ")");
				System.out.println();
			}
			
			
		}
		
		Inner in2 = new Inner();
		in2.method();
	}
	
}
