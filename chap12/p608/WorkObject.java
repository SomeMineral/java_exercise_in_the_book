package p608;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA - methodA() process start");
		notify(); // 차량 방향지시등..?
		try {
			wait();
		} catch (InterruptedException e) {}
		System.out.println("ThreadA - methodA() process end");
	}
		
	public synchronized void methodB() {
		System.out.println("ThreadB - methodB() process start");
		notify(); // 차량 방향지시등..?
		try {
			wait();
		} catch (InterruptedException e) {}		
		System.out.println("ThreadB - methodB() process end");
	}
}
