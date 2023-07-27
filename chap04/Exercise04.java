package example;

public class Exercise04 {
	public static void main(String[] args) {
		
		int diceOne = 0;
		int diceTwo = 0;
		int counting = 0;
		
		while(true) {
			counting += 1;
			diceOne = (int)(Math.random()*6) + 1;
			diceTwo = (int)(Math.random()*6) + 1;
			System.out.println("(" + diceOne + ", " + diceTwo + ")");
			if (diceOne + diceTwo == 5) {
				break;
			}
			if (counting >= 100) {
				System.out.println("Oh, so... sad. 100-times failure.");
				break;
			}
		}
		
		
		System.out.println("exit");
		
	}
}
