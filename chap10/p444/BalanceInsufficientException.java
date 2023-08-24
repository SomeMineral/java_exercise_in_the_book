package p444;

public class BalanceInsufficientException extends Exception {
	
	// two types of constructor 
	public BalanceInsufficientException() {}
	
	public BalanceInsufficientException(String message) {
		super(message); // Exception의 constructor를 그대로 갖다 쓰겠다 이거구만...
	}
}
