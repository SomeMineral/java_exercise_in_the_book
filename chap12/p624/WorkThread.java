package p624;

public class WorkThread extends Thread {
	
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted"); // Thread에서 상속 받은 것 중에 getName()이 있는 건가...!?
				break;
			}
		}
		System.out.println(getName() + " end");
	}
	
}
