package p614;

public class PrintThread2 extends Thread {
	public void run() {
		/*
		try {
			while(true) {
				System.out.println("processing"); // ..? 맞나? 가공인가? 흠.
				Thread.sleep(250); // for interrupt()
			}
		} catch (InterruptedException e) {}
		*/
		
		while(true) {
			System.out.println("processing?"); // ??
			
			if (Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("resource arrangement???"); // 영어 어려워. 용어 몰랑
		System.out.println("end");
	}
}
