package Atividades;

import java.util.Locale;

public class Atividade004 {
	
	public static void Executar() {
			
		//Saida de dados em Java:
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		//definindo ponto americano (ponto será usado no lugar de virgula)
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//concatenação
		System.out.println("resultado: " + x + " metros");
		
		//simplificando
		System.out.printf("Resultado: %.2f metros%n", x);
		
	}
}
