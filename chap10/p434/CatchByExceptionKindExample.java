package p434;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("not enough number of values");
			System.out.println("<how to use>");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		} catch (NumberFormatException e) {
			System.out.println("cannot convert to number");
		} finally {
			System.out.println("please restart");
		}
	}
}
