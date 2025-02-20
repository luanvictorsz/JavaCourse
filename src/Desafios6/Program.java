package Desafios6;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void Executar() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will be rented?: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(vect[i]);
		}
		
		sc.close();
	}
}
