package example;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.#ofStudent|2.InputScore|3.ScoreList|4.Analysis|5.Exit");
			System.out.println("-------------------------------------------------------");
			System.out.print("select> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {				
				System.out.print("# of student> ");
				studentNum = scanner.nextInt();
			} else if(selectNo == 2) {
				scores = new int[studentNum];
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if(selectNo == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				
				for (int score : scores) {
					sum += score;
					if (score > max) {
						max = score;
					}
				}
				avg = (double) sum / studentNum;
				System.out.println("maximum: " + max);
				System.out.println("average: " + avg);
				
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("Program Exit");
	}
}
