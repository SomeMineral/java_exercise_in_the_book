package example;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for (int number : array) {
			if (number > max) {
				max = number;
			}
		}
		
		
		System.out.println("max: " + max);
	}
}
