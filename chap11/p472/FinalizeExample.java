package p472;


// final fu----sion!

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for (int i=0; i<=20; i++) {
			counter = new Counter(i);
			
			counter = null; // reference delete...
			
			System.gc(); //garbage collector...?
		}
	}
}
