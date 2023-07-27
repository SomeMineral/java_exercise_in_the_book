package example;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		// while 내부에서만 코드 짜는 건 모르겠다. 포기
		
		String inputString;
		int temp;
		int counter = 0;
		
		
		while(run) {
			counter += 1;
			
			System.out.println("-------------------------------------");
			System.out.println("1.deposit|2.withdraw|3.balance|4.exit");
			System.out.println("-------------------------------------");
			System.out.print("select> ");
			
			inputString = scanner.nextLine();
			
			// 와...  String to Int 어렵구만...
			
			switch(inputString) {
			
				case "1":
					System.out.print("deposit> ");
					inputString = scanner.nextLine();
					
					try {
						temp = Integer.parseInt(inputString);
						if (temp < 0) {
							System.out.println("only positive value");
							break;
						}
						balance += temp;
					} catch(NumberFormatException ex) {
						ex.printStackTrace();
					}
					break;
					
				case "2":
					System.out.print("withdraw> ");
					inputString = scanner.nextLine();
					
					try {
						temp = Integer.parseInt(inputString);
						if (temp > balance) {
							System.out.println("must be bigger than balance");
							break;
						}
						balance -= temp;
					} catch(NumberFormatException ex) {
						ex.printStackTrace();
					}
					
					break;
				case "3":
					System.out.println("balance> " + balance);
					break;
				case "4":
					run = false;
					break;
				}
			if (counter >= 10) {
				break;
			}
		}
		System.out.println("exit");
	}
}
