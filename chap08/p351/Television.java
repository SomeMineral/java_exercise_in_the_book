package p351;

public class Television implements RemoteControl {
	//field
	private int volume;
	
	//turnOn method
	public void turnOn() {
		System.out.println("turn on the TV");
	}
	
	//turnOff method
	public void turnOff() {
		System.out.println("turn off the TV");
	}
	
	//setVolume method
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("current TV volume: " + this.volume);
	}
}
