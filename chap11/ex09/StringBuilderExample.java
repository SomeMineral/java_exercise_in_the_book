package ex09;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for (int i=1; i<=10; i++) {
			str += i;
		}
		System.out.println(str);
		
		// challenge to making improved code?
		
		StringBuilder sb = new StringBuilder(10);
		for (int i=1; i<=10; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
	
}
