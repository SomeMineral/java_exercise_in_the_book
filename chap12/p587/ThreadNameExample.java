package p587;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("program starting thread name: " + mainThread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("working thread name: " + threadA.getName());
		threadA.start();

		Thread threadB = new ThreadB();
		System.out.println("working thread name: " + threadB.getName());
		threadB.start();
		
	}
}
