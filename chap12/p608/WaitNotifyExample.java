package p608;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();

		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
	
		
		threadA.start();
		threadB.start();
		
		System.out.println("end");
		
		// 예제가 뭐 이래. 프로그램이 완료되질 않아. 루프 마지막에서 주고받는 거 문제있는데 고칠 줄 모름..ㅠ
	}
}
