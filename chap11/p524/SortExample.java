package p524;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = { 99, 92, 97, 88, 100 };
		
		Arrays.sort(scores);
		for (int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		
		
		
		String[] names = { "gil-dong", "dong-su", "min-su" };
		Arrays.sort(names);
		for (int i=0; i<names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println();
		
		
		Member m1 = new Member("gil-dong");
		Member m2 = new Member("dong-su");
		Member m3 = new Member("min-su");
		
		Member[] members = { m1, m2, m3 };
		
		Arrays.sort(members);
		for (int i=0; i<members.length; i++) {
			System.out.println("names[" + i + "].name = " + members[i].name);
		}
		System.out.println();
		
		
		
	}
}
