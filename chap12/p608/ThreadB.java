package p608;

public class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override // 오랜만에 써주네..?
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("B - " + i);
			workObject.methodB();
		}
		System.out.println("B - end");
	}
}
