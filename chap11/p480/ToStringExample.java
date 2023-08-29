package p480;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		String str1 = "gil-dong";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "have no name"));
	}
}
