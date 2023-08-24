package ex07;

public class NotExistIDException extends Exception{
	public NotExistIDException() {}
	
	public NotExistIDException(String message) {
		super(message); // Exception의 생성자가 알아서 해주겠지..
	}
}
