package example;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("total : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("average: " + avg);
		
		
		
		double sum2 = 0;
		for (double score : scores) {
			sum2 = sum2 + score;
		}
		System.out.println("total2: " + sum2);
	}
}
