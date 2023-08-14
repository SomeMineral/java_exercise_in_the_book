package p290;

public class CellPhone {
	// field
	String model;
	String color;
	
	// method
	void powerOn() {System.out.println("power on!");}
	void powerOff() {System.out.println("power off!");}
	void bell() {System.out.println("ring ring");}
	void sendVoice(String message) {System.out.println("to someone : " + message);}
	void receiveVoice(String message) {System.out.println("to me : " + message);}
	void hangUp() {System.out.println("hang up");}
	
}
