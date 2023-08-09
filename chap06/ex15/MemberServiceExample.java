package ex15;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("log-in");
			memberService.logout("hong");
		} else {
			System.out.println("id or password not correct.");
		}
	}
}
