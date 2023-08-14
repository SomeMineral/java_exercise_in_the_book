package p332;

public abstract class Phone {
	//field
	public String owner;
	
	//constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//method
	public void turnOn() {
		System.out.println("Turn on the phone");
	}
	
	public void turnOff() {
		System.out.println("Turn off the phone");
	}
}
