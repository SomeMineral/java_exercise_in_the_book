package p521;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		// how to 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		// how to 2
		char[] arr3 = Arrays.copyOfRange(arr1, 2, arr1.length);
		System.out.println(Arrays.toString(arr3));
		
		// how to 3
		char[] arr4 = new char[arr1.length]; // 빈 배열 생성..?
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		// (source, source_start_index, target array, target_start_index, #of_copy_component)어려워우어
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
	}
}
