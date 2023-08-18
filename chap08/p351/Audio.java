package p351;

public class Audio implements RemoteControl {
	//field
	private int volume;
	
	//turnOn method
	public void turnOn() {
		System.out.println("turn on the audio");
	}
	
	//turnOff method
	public void turnOff() {
		System.out.println("turn off the audio");
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
		System.out.println("current audio volume: " + this.volume);
	}
}

// interface의 abstact method 중 하나라도 모자라면... -> abstract class가 되어야 함.
