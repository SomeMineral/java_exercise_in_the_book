package example;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("input some messages?");
		System.out.println("if you want to quit this, enter q");
		// try에 넣으라고 이클립스께서 추천해주심
		try (Scanner scanner = new Scanner(System.in)) {
			String inputString;
			
			do {
				System.out.println(">");
				inputString = scanner.nextLine();
				System.out.println(inputString);
			} while (!inputString.equals("q"));
		}
		System.out.println();
		System.out.println("exit");
		
	}
}
