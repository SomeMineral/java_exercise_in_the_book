package p624;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA"); // myGroup 아래에서 일할게여.
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB"); // myGroup 아래에서 일할게여.
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ the output content of list() method in main thread group ]"); // ?
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list(); // 출력까지 기능에 포함된건가...?
		System.out.println();
		
		try {
			Thread.sleep(3000); 
		} catch (InterruptedException e) {}
		
		System.out.println("[ the call of interrupt() method in myGroup ]"); //?
		myGroup.interrupt(); // 쉬고 있으면 어서 정지하시게.
	}
}
