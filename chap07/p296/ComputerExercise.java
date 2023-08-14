package p296;

public class ComputerExercise {
	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("the area of the circle : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("the area of the circle : " + computer.areaCircle(r));
	}
}
