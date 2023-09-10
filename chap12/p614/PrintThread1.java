package p614;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("i n g");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
		System.out.println("resource ?"); // 
		System.out.println(" end");
	}
}
