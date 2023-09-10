package ex10;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		
		thread.setDaemon(true);
		
		thread.start();
		
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		
		
		System.out.println("main end");
	}
}
