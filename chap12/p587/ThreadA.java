package p587;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for (int i=0; i<2; i++) {
			System.out.println("text output from " + getName());
		}
	}
}
