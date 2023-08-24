package p444;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		//deposit
		account.deposit(10000);
		System.out.println("current balance: " + account.getBalance());
		
		//withdraw
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); // return type : String
			
			System.out.println("error message: " + message);
			System.out.println();
			
			e.printStackTrace(); // return type : void
			
		}
	}
}
