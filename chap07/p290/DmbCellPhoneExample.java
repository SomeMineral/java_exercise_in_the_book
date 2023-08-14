package p290;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//Dmb object creation
		DmbCellPhone dmbCellPhone = new DmbCellPhone("java-phone", "black", 10);
		
		//field from CellPhone
		System.out.println("model: " + dmbCellPhone.model);
		System.out.println("color: " + dmbCellPhone.model);
		
		//field from DmbCellPhone
		System.out.println("channel: " + dmbCellPhone.channel);
		
		//call method from CellPhone
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello~?");
		dmbCellPhone.receiveVoice("hello~ this is gil-dong");
		dmbCellPhone.sendVoice("oh, how are you?");
		dmbCellPhone.hangUp();
		
		//call method from DmbCellPhone
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
