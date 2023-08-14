package p327;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - conversion success to Child");
		} else {
			System.out.println("method1 - no conversion");
		}
	}
		
	public static void method2(Parent parent) {
		Child child = (Child) parent; // without confirmation?
		System.out.println("method2 - conversion success to Child");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
		/*
		parentA remote controller ( initially for Child object )
		-> [ p p p | (c c c) : locked] 
		
		Child child = (Child) parent;
		-> [ p p p | c c c : unlocked]
		
		parentB remote controller ( initially for Parent object )
		-> [ p p p ] 
		
		Child child = (Child) parent;
		-> [ p p p ] c? c? c? ( have no button for Child ) - > error
		
		*/
	}
}

