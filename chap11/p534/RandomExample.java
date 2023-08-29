package p534;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// number select?
		int[] selectNumber = new int[6];
		Random random = new Random(3); //... seed?
		
		System.out.print("selected number: ");
		for (int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// lucky number?
		int[] winningNumber = new int[6];
		random = new Random(5);
		
		System.out.print("lucky number: ");
		for (int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// win?
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("result: ");
		
		if (result) {
			System.out.println("wow! 1st prize!");
		} else {
			System.out.println("Ooops!");
		}
		
	}
}
