package p497;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "beef,pork&chicken-ssamyachae+rice";
		
		String[] names = text.split("&|,|-|\\+"); //  와... \\이렇게 2개 넣어야 하네.
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
