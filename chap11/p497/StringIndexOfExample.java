package p497;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "java programming";
		
		int location = subject.indexOf("programming");
		System.out.println(location);
		
		
		// 찾는 게 없으면 -1
		if(subject.indexOf("java") != -1) {
			System.out.println("it relates to java");
		} else {
			System.out.println("it doesn't relate to java");
		}
	}
}
