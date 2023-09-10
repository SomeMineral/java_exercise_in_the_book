package p604;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA process content AAAAA");//?
			
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {}	
				
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA ends");
	}
}
