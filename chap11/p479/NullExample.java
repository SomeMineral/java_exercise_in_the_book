package p479;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "gil-dong";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		System.out.println( Objects.requireNonNull(str1) == str1 );
		System.out.println();
		
		try {
			String name = Objects.requireNonNull(str2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "have no name");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()->"have! no! name!"); // 아직 모름..
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
