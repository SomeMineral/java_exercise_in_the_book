package p351;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc; // interface
		rc = new Television();
		rc = new Audio();
	}
}
