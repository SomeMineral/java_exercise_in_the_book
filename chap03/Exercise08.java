package example;

public class Exercise08 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if (Double.isNaN(z)) {
			System.out.println("Unable to be divided from 0.0");
		} else {
			double result = z + 10;
			System.out.println("result: " + result);
		}
	}
}
