package example;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("get 1");
			break;
		case 2:
			System.out.println("get 2");
			break;
		case 3:
			System.out.println("get 3");
			break;
		case 4:
			System.out.println("get 4");
			break;
		case 5:
			System.out.println("get 5");
			break;
		default:
			System.out.println("get 6");
			break;
		}
	}
}
