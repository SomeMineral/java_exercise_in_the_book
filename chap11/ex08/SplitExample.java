package ex08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "ID,name,password";
		
		// ver.1
		String[] splitBox = str.split(",");
		for (String word : splitBox) {
			System.out.println(word);
		}
		System.out.println();
		// ver.2
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int countToken = st.countTokens();
		
		for (int i=0; i<countToken; i++) {
			String tok = st.nextToken();
			System.out.println(tok);
		}
		
		// 아! for 조건 내에 countTokens() 넣으면 안 되는 게 당연하구나!
		// 출력하면서 token 개수가 줄어드니까 조건 자체가 변경되어 버림!
		// 이런 바보같은 짓을..!

	}
}