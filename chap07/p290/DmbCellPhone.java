package p290;

public class DmbCellPhone extends CellPhone {
	//field
	int channel;
	
	//constructor
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("channel " + channel + " turn on dmb");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel is changed to " + channel );
	}
	void turnOffDmb() {
		System.out.println("turn off dmb");
	}
}
