package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Atividade016 atv = new Atividade016();
		
		atv.Executar();
		
		/* Atividade015 account;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Is there na initial deposit? (y/n): ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter a deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Atividade015(number, name, initialDeposit);
		}
		else
		{
			account = new Atividade015(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();
		
		*/
	}
}
