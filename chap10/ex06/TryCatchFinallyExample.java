package ex06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		
		for (int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("exceed indices");
			} catch (NumberFormatException e) {
				System.out.println("cannot it convert to number");
			} finally {
				System.out.println(value);
			}
		}
	}
}
