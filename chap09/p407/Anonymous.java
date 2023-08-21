package p407;

public class Anonymous {
	
	
	// part A - field
	Person field = new Person() {
		// Person has only 'wake' method.
		void work() {
			System.out.println("go to work");
		}
		
		@Override
		void wake() {
			System.out.println("get up at 6 am");
			work();
		}
		
	};
	
	
	void method1() {
	// part B - local
		Person localVar = new Person() {
			void walk() {
				System.out.println("go for a walk");
			}
			
			@Override
			void wake() {
				System.out.println("get up at 7 am");
				walk();
			}
			
		};
		
		localVar.wake();		
	}
	
	
	// part C - parameter
	void method2(Person person) {
		person.wake();
	}
	
	
	
}
