package p587;

public class ThreadB extends Thread {
	
	public void run() {
		for (int i=0; i<2; i++) {
			System.out.println("text output from " + getName());
		}
	}
}
