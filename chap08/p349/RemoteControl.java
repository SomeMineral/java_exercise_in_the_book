package p349;

public interface RemoteControl {
	//constant, (public static final) automatically
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// abstract method, (public abstract) automatically
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume); 
	// only declaration
	
	
	
	// default method, (public) automatically
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("mute!");
		} else {
			System.out.println("unmute!");
		}
	}
	// to the execution part? ( eng so difficult to me)
	
}
