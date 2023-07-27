package example;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("more than 90");
			System.out.println("grade A");
		} else if(score >= 80) {
			System.out.println("more than 80");
			System.out.println("grade B");
		} else if(score >= 70){
			System.out.println("more than 70");
			System.out.println("grade C");
		} else {
			System.out.println("less than 70");
			System.out.println("grade D");
		}
		
	}
}
