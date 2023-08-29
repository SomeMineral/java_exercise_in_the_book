package p521;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = { {1,2}, {3,4} };
		
		// shallow copy
		System.out.println("[shallow copy and comparison]"); // 맞..나?
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("array address comparison: " + original.equals(cloned1));
		System.out.println("first level comparison?: " + Arrays.equals(original, cloned1));
		System.out.println("nested level comparison?: " + Arrays.deepEquals(original, cloned1));
		
		System.out.println();
		
		// deep copy
		System.out.println("[deep copy and comparison]"); // 맞..나?
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		
		System.out.println("array address comparison: " + original.equals(cloned2));
		System.out.println("first level comparison?: " + Arrays.equals(original, cloned2));
		System.out.println("nested level comparison?: " + Arrays.deepEquals(original, cloned2));
				
		
		
	}
}
