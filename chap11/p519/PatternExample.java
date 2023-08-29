package p519;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// String 내부에선 \ 하나만 그으면 문제 생겨서 두 개 긋는다고...
		// 정규표현식 자체로 보자면 (02|010)-\d{3,4}-\d{4}가 맞는 거고..
		
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("match!");
		} else {
			System.out.println("no match!");
		}
		
		System.out.println();
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("match!");
		} else {
			System.out.println("no match!");
		}
		
	}
}
