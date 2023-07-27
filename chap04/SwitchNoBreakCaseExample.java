package example;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("current time: " + time );
		
		switch(time) {
		case 8:
			System.out.println("go work");
		case 9:
			System.out.println("meeting");
		case 10:
			System.out.println("working");
		default:
			System.out.println("go out to work");
		}
	}
}
