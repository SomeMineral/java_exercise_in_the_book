package ex19;

public class Account {

	private int balance = 0;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	void setBalance(int value) {
		if (value > MAX_BALANCE || value < MIN_BALANCE) {
			return;
		} else {
			this.balance = value;
		}
	}
	
	int getBalance() {
		return this.balance;
	}
}
