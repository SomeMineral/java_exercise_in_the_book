package p223;

public class Car {
	//field
	int gas;
	
	//method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("there is no gas.");
			return false;
		}
		System.out.println("gas is here");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("run(left of gas:" + gas +")");
				gas -= 1;
			} else {
				System.out.println("stop(left of gas:" + gas + ")");
				return;
			}
		}
	}
}
