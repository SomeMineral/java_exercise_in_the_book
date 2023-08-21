package p400;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			
			System.out.println(field);
			method();
			
			System.out.println();
			
			// this 하나만 있을 땐 어차피 가리키는 게 같아서 붙일 필요가 없네...
			System.out.println(this.field);
			this.method();//
			
			// print()를 담고 있는 Nested, 이보다 더 바깥을 참조하려면 class_name.this.(field/method) 형태로 작성.
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
