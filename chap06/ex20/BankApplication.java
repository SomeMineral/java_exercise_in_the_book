package ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.create_account | 2.account_list | 3.deposit | 4.withdraw | 5.exit");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("select> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("program exit");
	}
		// create account
		private static void createAccount() {	
		
			System.out.println("--------------");
			System.out.println("create account");
			System.out.println("--------------");
			
			System.out.print("account number: "); // ano
			String ano = scanner.next();
			System.out.print("account holder: "); // owner
			String owner = scanner.next();
			System.out.print("initial deposit: ");
			int balance = scanner.nextInt();
			
			for (int i=0; i<accountArray.length; i++) {
				if (accountArray[i] == null) {
					accountArray[i] = new Account(ano, owner, balance);
					break;
				}
			}
		}
		
		// account list
		private static void accountList() {
			System.out.println("--------------");
			System.out.println("account list");
			System.out.println("--------------");
			for (int i=0; i<accountArray.length; i++) {
				if (accountArray[i] == null) {
					break;
				}
				System.out.print(accountArray[i].getAno());
				System.out.print("    ");
				System.out.print(accountArray[i].getOwner());
				System.out.print("    ");
				System.out.print(accountArray[i].getBalance());
				System.out.println();
			}
		}
		
		// deposit
		private static void deposit() {
			System.out.println("--------------");
			System.out.println("deposit");
			System.out.println("--------------");
			
			System.out.print("account number: "); // ano
			String ano = scanner.next();
			System.out.print("deposit: ");
			int addedBalance = scanner.nextInt();
			
			Account targetAccount = findAccount(ano);
			
			if (targetAccount == null) {
				System.out.println("There is no that account");
				return;
			}
			
			int currentBalance = targetAccount.getBalance();
			int newBalance = currentBalance + addedBalance;
			targetAccount.setBalance(newBalance);
			
			System.out.println("deposit success");
		}
		
		// withdraw
		private static void withdraw() {
			System.out.println("--------------");
			System.out.println("withdraw");
			System.out.println("--------------");
			
			System.out.print("account number: "); // ano
			String ano = scanner.next();
			System.out.print("withdraw: ");
			int minusedBalance = scanner.nextInt();
			
			Account targetAccount = findAccount(ano);
			
			if (targetAccount == null) {
				System.out.println("There is no that account");
				return;
			}
			
			int currentBalance = targetAccount.getBalance();
			int newBalance = currentBalance - minusedBalance;
			if (newBalance < 0) {
				System.out.println("not enough balance in this account");
				return;
			}
			
			targetAccount.setBalance(newBalance);
			
			System.out.println("withdraw success");
			
		}
		
		// find same account in Account array
		private static Account findAccount(String ano) {
			for (int i=0; i<accountArray.length; i++) {
				if (ano.equals(accountArray[i].getAno())) {
					return accountArray[i];
				}
			}
			return null;
	}
}
