package ex08;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("play the movie");
			if (Thread.interrupted()) {
				break;
			}
		}
	}
}
