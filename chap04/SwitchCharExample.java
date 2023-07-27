package example;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("VIP");
			break;
		case 'B':
		case 'b':
			System.out.println("Common");
			break;
		default:
			System.out.println("-");
		}
	}
}
