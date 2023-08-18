package p361;
import p351.RemoteControl;

public class Audio implements RemoteControl {
	//field
	private int volume;
	
	//added field
	private boolean mute;
	
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
	
	//added method?
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("audio mute");
		} else {
			System.out.println("audio unmute");
		}
	}
	
}
