package Desafios4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void Executar() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai adicionar: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			int num = sc.nextInt();
			
			if(num > 0) {
				System.out.println("Numeros Negativos: ");
				
			}
		}
		
		
		
		sc.close();
		
	}
}
