package p469;

public class MemberExample {
	public static void main(String[] args) {
		// create original object
		Member original = new Member("gil-dong", 25, new int[] {90,90}, new Car("sonata"));
		
		//change the value of the reference object, after get the copied object
		// the? 어떻게 써야.. 너무 어려워.
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "random";
		
		System.out.println("[ the field values of the copied object ]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		
		System.out.print("scores: {");
		for (int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print( (i==(cloned.scores.length-1)) ? "" : "," ); // condition ? when true : when false
		}
		
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[ the field values of the original object ]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		
		System.out.print("scores: {");
		for (int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print( (i==(original.scores.length-1)) ? "" : "," ); // (condition) ? when true : when false
		}
		
		System.out.println("}");
		System.out.println("car: " + original.car.model);
		
	}
}
