package ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		// length : 8~12, first : alphabet, from second : alphabet or number
		//String id = "999bird999";
		String id = "testID00";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("valid ID");
		} else {
			System.out.println("invalid ID form"); //?
		}
	}
}
