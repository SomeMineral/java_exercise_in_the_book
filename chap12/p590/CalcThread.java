package p590;

public class CalcThread extends Thread {
	
	public static final int COUNT_NUMBER = 10000000;
	
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for (int i=0; i<COUNT_NUMBER; i++) {
		}
		System.out.println(getName());
	}
}
