package p598;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("target thread state: " + state);
			
			if (state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if (state == Thread.State.TERMINATED) {
				break;
			}
			try {
				// 너무 빠르면 안 보이니까 좀 멈춰.
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}
