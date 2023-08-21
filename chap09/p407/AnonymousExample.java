package p407;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// part A
		anony.field.wake();
		
		// part B
		anony.method1();
		
		// part C
		anony.method2(
			new Person() {
				void study() {
					System.out.println("study");
				}
				
				@Override
				void wake() {
					System.out.println("get up at 8 am");
					study();
				}
				
			}
		);
	}
}
