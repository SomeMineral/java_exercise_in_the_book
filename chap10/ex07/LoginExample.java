package ex07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception{
		// if id is not blue, execute NotExistIDException
		if(!id.equals("blue")) {
			throw new NotExistIDException("this id doesn't exist");
		}
		
		// if password is not 12345, execute WrongPasswordException
		if(!password.equals("12345")) {
			throw new WrongPasswordException("wrong password");
		}
	}
}
