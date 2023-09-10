package p608;

public class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override // 오랜만에 써주네..?
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("A - " + i);
			workObject.methodA();	
		}
		System.out.println("A - end");
	}
}
