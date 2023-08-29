package ex07;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "All programs can be developed with java"; //?
		int index = str.indexOf("java");
		if (index == -1) {
			System.out.println("java is not contained");
		} else {
			System.out.println("java is contained");
			str = str.replace("java", "JAVA");
			
			System.out.println("-->" + str);
		}
	}
}
