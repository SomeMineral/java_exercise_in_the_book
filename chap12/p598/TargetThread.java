package p598;

public class TargetThread extends Thread {
	public static final long LOOP_COUNT = 100000000;
	
	public void run() {
		for (long i=0; i<LOOP_COUNT; i++) {	}
		
		
		try {
			Thread.sleep(1500);
		} catch(Exception e) {System.out.println("some exception?");}
		
		
		for (long i=0; i<LOOP_COUNT; i++) {}
		
		
	}
}
