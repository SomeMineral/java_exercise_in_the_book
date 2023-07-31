package example;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int lengthCount = 0;
		
		for (int[] line : array) {
			for (int number : line) {
				lengthCount += 1;
				sum += number;
			}
		}
		
		avg = (double) sum / lengthCount;
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
