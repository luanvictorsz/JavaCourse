package Atividades;

import java.util.Scanner;

public class Atividade11 {
	public static void Executar() {
		//Expressao Condicional ternária
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		
		//expressao simplificada
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		/*
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
		*/
		sc.close();
	}
}	
