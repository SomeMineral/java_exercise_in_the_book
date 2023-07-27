package example;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		
		while(run) {
			if (keyCode !=13 && keyCode != 10) {
				System.out.println("-----------------------");
				System.out.println("1.up | 2. down | 3.stop");
				System.out.println("-----------------------");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49) { // it means 'number 1'
				speed++;
				System.out.println("current speed: " + speed);
			} else if (keyCode == 50) { // it means 'number 2'
				speed--;
				System.out.println("current speed: " + speed);
			} else if (keyCode == 51) { // it means 'number 3'
				run = false;
			}
		}
		
		System.out.println("exit");
	}
}
