package p467;

public class MemberExample {
	public static void main(String[] args) {
		// create original object
		Member original = new Member("blue", "gil-dong", "12345", 25, true);
		
		// get copy and change password
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[ fields of copy object ]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[ fields of original object ]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);
		
	}
}
