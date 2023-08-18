package p348;

public interface RemoteControl {
	//constant (public static final) automatically
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// abstract method (public abstract) automatically
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
