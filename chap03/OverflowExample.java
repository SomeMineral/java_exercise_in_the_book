package example;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; // error
		long z1 = (long) x * y;
		
		
		System.out.println(z1);
	}
}
