package p356;
import p351.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	
	//from RemoteControl
	public void turnOn() {
		System.out.println("turn on smartTV");
	}
	public void turnOff() {
		System.out.println("turn off smartTV");
	}
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("current smartTV volume: " + this.volume);
	}
	
	//from Searchable
	public void search(String url) {
		System.out.println("search " + url);
	}
}
