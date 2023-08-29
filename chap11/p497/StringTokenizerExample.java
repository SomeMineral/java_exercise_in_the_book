package p497;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "dekiru/neko/kyou";
		
		// how to get token 1 : for-loop
		StringTokenizer st = new StringTokenizer(text, "/"); // 쪼개서 저장?
		int countTokens = st.countTokens(); // 개수 정보?
		for (int i=0; i<countTokens; i++) {
			String token = st.nextToken(); // python iterator의 next와 같은건가.
			System.out.println(token);
		}
		
		System.out.println("-------------------------");
		
		
		// how to get token 2 : while-loop (confirm left tokens)
		st = new StringTokenizer(text, "/");
		while( st.hasMoreTokens() ) { // 토근 더 있니?
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
