package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade5 {
	public static void Executar() {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Qual o seu nome?: ");
		String nome = sc.next();
		System.out.println("Olá " + nome);
		
		//para valores double
		double x;
		x = sc.nextDouble();
		System.out.println("valor double: " + x);
		
		//valores inteiros
		x = sc.nextInt();
		System.out.println("Valor Inteiro: " + x);
		
		//ler doc para mais
		
		sc.close();
	}
}
