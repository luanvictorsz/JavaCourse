package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade005 {
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
		
		//lendo mais de uma linha e quebra de linha pendente
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//ler doc para mais
		
		sc.close();
	}
}
