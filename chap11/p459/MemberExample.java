package p459;

public class MemberExample {
	public static void main(String args[]) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1, obj2 : same");
		} else {
			System.out.println("obj1, obj2 : different");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1, obj3 : same");
		} else {
			System.out.println("obj1, obj3 : different");
		}
	}
}
