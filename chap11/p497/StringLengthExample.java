package p497;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "1234561234567";
		int length = ssn.length();
		
		if (length==13) {
			System.out.println("correct");
		} else {
			System.out.println("wrong");
		}
	}
}
