package p581;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		for (int i=0; i<5; i++) {
			System.out.println("Ding!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		
		System.out.println("End!");
		
		// 이렇게 쓰면 되는 게 없음.
	}
}
