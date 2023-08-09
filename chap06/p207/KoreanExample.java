package p207;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("java", "001122-3333333");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);

		Korean k2 = new Korean("javava", "001023-4444444");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
