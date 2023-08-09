package p232;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("the area of square = " + result1);
		System.out.println("the area of rectangle = " + result2);
	}
}
