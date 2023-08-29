package p526;

import p524.Member;
import java.util.Arrays;


public class SearchExample {
	public static void main(String[] args) {
		//primitive type search?
		int[] scores = { 80, 50, 90 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 50);
		System.out.println("index found: " + index);
		
		//String search
		String[] names = { "bacon", "berry", "water", "pork" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "pork");
		System.out.println("index found: " + index);
		
		//object search
		
		Member m1 = new Member("ha");
		Member m2 = new Member("hi");
		Member m3 = new Member("hu");
		
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members); // Member class에서 compare 정의해놔서 가능한 건가.
		index = Arrays.binarySearch(members, m2);
		System.out.println("index found: " + index);
		
		
	}
}
